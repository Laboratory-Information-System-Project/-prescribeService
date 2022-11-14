package com.douzone.prescribeservice.service.patient;

import com.douzone.prescribeservice.entity.Visit;

import java.util.List;

public interface PatientService {
    List<Visit> findPatient(Long patientNo);
}
