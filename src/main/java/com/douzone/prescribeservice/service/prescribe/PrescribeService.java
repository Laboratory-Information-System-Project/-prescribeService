package com.douzone.prescribeservice.service.prescribe;

import com.douzone.prescribeservice.entity.Prescribe;

import java.util.List;

public interface PrescribeService {
    List<Prescribe> findPrescribes(Long visitNo);
}
