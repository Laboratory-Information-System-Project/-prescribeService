package com.douzone.prescribeservice.repository.patient;

import com.douzone.prescribeservice.entity.*;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;
import java.util.stream.Collectors;

public class PatientRepositoryImpl extends QuerydslRepositorySupport implements CustomPatientRepository {

    public PatientRepositoryImpl() {
        super(Patient.class);
    }

    @Override
    public List<Prescribe> findPatientInfo(Long patientNo) {
        QPatient patient = QPatient.patient;
        QVisit visit = QVisit.visit;
        QPrescribe prescribe = QPrescribe.prescribe;

        return from(prescribe)
                .join(prescribe.visit, visit)
                .join(visit.patient, patient)
                .where(patient.patientNo.eq(patientNo))
                .stream().collect(Collectors.toList());

        // ObjectMapper obj = new ObjectMapper();
        // obj.
        // return from(visit)
        //         .join(visit.patient, patient)
        //         .where(patient.patientNo.eq(patientNo)).stream().collect(Collectors.toMap());
    }
}
