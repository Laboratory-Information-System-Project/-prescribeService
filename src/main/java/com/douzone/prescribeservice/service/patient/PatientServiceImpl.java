package com.douzone.prescribeservice.service.patient;

import com.douzone.prescribeservice.entity.Visit;
import com.douzone.prescribeservice.repository.patient.PatientRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PatientServiceImpl implements PatientService{

    private final PatientRepository patientRepository;
    @Override
    public List<Visit> findPatient(Long patientNo) {

        return patientRepository.findPatientInfo(patientNo);
    }
}
