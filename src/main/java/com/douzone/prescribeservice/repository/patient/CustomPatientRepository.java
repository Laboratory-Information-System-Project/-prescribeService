package com.douzone.prescribeservice.repository.patient;

import com.douzone.prescribeservice.entity.Prescribe;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface CustomPatientRepository {
    List<Prescribe> findPatientInfo(Long patientNo);
}
