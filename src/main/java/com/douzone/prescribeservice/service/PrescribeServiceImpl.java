package com.douzone.prescribeservice.service;

import com.douzone.prescribeservice.entity.Prescribe;
import com.douzone.prescribeservice.entity.Visit;
import com.douzone.prescribeservice.repository.prescribe.PrescribeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PrescribeServiceImpl implements PrescribeService{

    private final PrescribeRepository prescribeRepository;
    @Override
    public List<Prescribe> findPrescribes(Long visitNo) {
        return prescribeRepository.findAllByVisitVisitCode(visitNo);
        // return null;
    }
}
