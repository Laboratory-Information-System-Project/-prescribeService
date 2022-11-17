package com.douzone.prescribeservice.repository.prescribe;

import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface CustomPrescribeRepository {
    long updateStatus(List<Long> prescribeCode, String status);

    // String findDoctorCodeByVisitCode();
}
