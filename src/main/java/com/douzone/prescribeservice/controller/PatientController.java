package com.douzone.prescribeservice.controller;

import com.douzone.prescribeservice.entity.Patient;
import com.douzone.prescribeservice.service.PatientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/prescribe-service/")
@Slf4j
public class PatientController {
    private final PatientService patientService;

    @GetMapping("/patient/{patientNo}")
    public Patient getPatient(@PathVariable Long patientNo){
        log.info("test");
        return patientService.findPatient(patientNo);
    }




}
