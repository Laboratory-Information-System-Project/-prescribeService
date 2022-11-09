package com.douzone.prescribeservice.service;

import com.douzone.prescribeservice.entity.Patient;

public interface PatientService {
    Patient findPatient(Long patientNo);
}
