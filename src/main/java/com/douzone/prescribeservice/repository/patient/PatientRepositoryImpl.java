package com.douzone.prescribeservice.repository.patient;

import com.douzone.prescribeservice.domain.PatientInfoDto;
import com.douzone.prescribeservice.entity.*;
import com.querydsl.core.types.Projections;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class PatientRepositoryImpl extends QuerydslRepositorySupport implements CustomPatientRepository {

    public PatientRepositoryImpl() {
        super(Patient.class);
    }

    @Override
    public List<PatientInfoDto> findPatientInfo(Long patientNo) {
        QPatient patient = QPatient.patient;
        QVisit visit = QVisit.visit;
        QPrescribe prescribe = QPrescribe.prescribe;

        return from(visit)
                .leftJoin(visit.patient, patient)
                .select(Projections.constructor(PatientInfoDto.class,
                        patient.patientNo,
                        patient.patientName,
                        patient.patientAge,
                        patient.patientBloodType,
                        patient.patientHeight,
                        patient.patientWeight,
                        patient.patientAddress,
                        patient.patientPhoneNumber,
                        patient.patientResidentNumber,
                        patient.patientGender,
                        visit.visitCode,
                        visit.visitDt,
                        visit.visitStatus
                ))
                .where(patient.patientNo.eq(patientNo))
                .stream().collect(Collectors.toList());
    }
}
