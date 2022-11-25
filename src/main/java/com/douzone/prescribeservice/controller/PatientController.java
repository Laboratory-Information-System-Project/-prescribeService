package com.douzone.prescribeservice.controller;

import com.douzone.prescribeservice.domain.PatientInfoDto;
import com.douzone.prescribeservice.service.patient.PatientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/prescribe-service/")
@Slf4j
@Component
public class PatientController {
    private final PatientService patientService;

    @GetMapping("/patient/{patientNo}")
    public List<PatientInfoDto> getPatient(@PathVariable Long patientNo){

        return patientService.findPatient(patientNo);
    }


}
