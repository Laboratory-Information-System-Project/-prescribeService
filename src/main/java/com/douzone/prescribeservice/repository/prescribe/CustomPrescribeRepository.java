package com.douzone.prescribeservice.repository.prescribe;

import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Map;

@NoRepositoryBean
public interface CustomPrescribeRepository {
    long updateStatus(List<Long> prescribeCode, String status);

    Map<Long, String> findDoctorIdByVisitVisitCode(List<Long> visitCode);
}
