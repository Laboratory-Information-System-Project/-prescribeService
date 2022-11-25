package com.douzone.prescribeservice.repository.patient;

import com.douzone.prescribeservice.domain.PatientInfoDto;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface CustomPatientRepository {
    List<PatientInfoDto> findPatientInfo(Long patientNo);
}
