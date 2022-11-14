package com.douzone.prescribeservice.repository.prescribe;

import com.douzone.prescribeservice.entity.Prescribe;
import com.douzone.prescribeservice.entity.QPrescribe;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

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
}
