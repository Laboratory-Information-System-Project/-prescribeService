package com.douzone.prescribeservice.repository.patient;

import com.douzone.prescribeservice.entity.Patient;
import com.douzone.prescribeservice.entity.QPatient;
import com.douzone.prescribeservice.entity.QVisit;
import com.douzone.prescribeservice.entity.Visit;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;
import java.util.stream.Collectors;

public class PatientRepositoryImpl extends QuerydslRepositorySupport implements CustomPatientRepository {

    public PatientRepositoryImpl() {
        super(Patient.class);
    }

    @Override
    public List<Visit> findPatientInfo(Long patientNo) {
        QPatient patient = QPatient.patient;
        QVisit visit = QVisit.visit;

        return from(visit)
                .join(visit.patient, patient)
                .where(patient.patientNo.eq(patientNo)).stream().collect(Collectors.toList());
    }
}
