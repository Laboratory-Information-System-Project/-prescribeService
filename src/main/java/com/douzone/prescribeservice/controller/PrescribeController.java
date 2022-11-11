package com.douzone.prescribeservice.controller;

import com.douzone.prescribeservice.entity.Prescribe;
import com.douzone.prescribeservice.service.PrescribeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/prescribe-service")
public class PrescribeController {

    private final PrescribeService prescribeService;

    @GetMapping("/prescribe/{visitNo}")
    public List<Prescribe> getPrescribes(@PathVariable Long visitNo){

        return prescribeService.findPrescribes(visitNo);

    }

}
