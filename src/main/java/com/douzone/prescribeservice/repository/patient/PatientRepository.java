package com.douzone.prescribeservice.repository.patient;

import com.douzone.prescribeservice.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long>, CustomPatientRepository {
}
