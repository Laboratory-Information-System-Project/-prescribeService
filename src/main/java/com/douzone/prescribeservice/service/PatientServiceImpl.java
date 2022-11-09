package com.douzone.prescribeservice.service;

import com.douzone.prescribeservice.entity.Patient;
import com.douzone.prescribeservice.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
@Slf4j
public class PatientServiceImpl implements PatientService{

    private final PatientRepository patientRepository;
    @Override
    public Patient findPatient(Long patientNo) {
        Patient patient = patientRepository.findById(patientNo).get();

        if(Objects.isNull(patient)){
            log.error("patient is null!!");
        }

        return patient;
    }
}
