package com.douzone.prescribeservice.service.patient;

import java.util.List;
import java.util.Map;

public interface PatientService {
    List<Map<String, Object>> findPatient(Long patientNo);
}
