package com.douzone.prescribeservice.controller;

import com.douzone.prescribeservice.entity.Visit;
import com.douzone.prescribeservice.service.patient.PatientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/prescribe-service/")
@Slf4j
public class PatientController {
    private final PatientService patientService;

    @GetMapping("/patient/{patientNo}")
    public List<Visit> getPatient(@PathVariable Long patientNo){
        log.info("test");
        return patientService.findPatient(patientNo);
    }


}
