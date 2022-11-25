package com.douzone.prescribeservice.service.patient;

import com.douzone.prescribeservice.domain.PatientInfoDto;

import java.util.List;

public interface PatientService {
    List<PatientInfoDto> findPatient(Long patientNo);
}
