package com.douzone.prescribeservice.repository.patient;

import com.douzone.prescribeservice.entity.Visit;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface CustomPatientRepository {
    List<Visit> findPatientInfo(Long patientNo);
}
