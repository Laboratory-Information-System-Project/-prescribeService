package com.douzone.prescribeservice.repository.prescribe;

import com.douzone.prescribeservice.entity.Prescribe;
import com.douzone.prescribeservice.entity.QPrescribe;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

import static com.querydsl.core.group.GroupBy.groupBy;

public class PrescribeRepositoryImpl extends QuerydslRepositorySupport implements CustomPrescribeRepository {
    /**
     * Creates a new {@link QuerydslRepositorySupport} instance for the given domain type.
     *
     * @param domainClass must not be {@literal null}.
     */
    public PrescribeRepositoryImpl() {
        super(Prescribe.class);
    }

    @Transactional
    public long updateStatus(List<Long> prescribeCodeList, String status){
        QPrescribe prescribe = QPrescribe.prescribe;

        return update(prescribe)
                .set(prescribe.status.statusCode, status)
                .where(prescribe.prescribeCode.in(prescribeCodeList))
                .execute();
    }

    @Override
    public Map<Long, String> findDoctorIdByVisitVisitCode(List<Long> visitCode) {
        QPrescribe prescribe = QPrescribe.prescribe;
        return from(prescribe)
                .distinct()
                .where(prescribe.visit.visitCode.in(visitCode))
                .transform(groupBy(prescribe.visit.visitCode).as(prescribe.doctorId));
    }
}
