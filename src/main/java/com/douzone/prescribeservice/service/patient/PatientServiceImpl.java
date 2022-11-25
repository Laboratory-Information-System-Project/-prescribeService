package com.douzone.prescribeservice.service.patient;

import com.douzone.prescribeservice.domain.PatientInfoDto;
import com.douzone.prescribeservice.repository.patient.PatientRepository;
import com.douzone.prescribeservice.repository.prescribe.PrescribeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Slf4j
public class PatientServiceImpl implements PatientService{

    private final PatientRepository patientRepository;
    private final PrescribeRepository prescribeRepository;
    private final ModelMapper modelMapper;
    @Override
    public List<PatientInfoDto> findPatient(Long patientNo) {
        List<PatientInfoDto> patientInfo = patientRepository.findPatientInfo(patientNo);
        List<Long> visitCodeList = new ArrayList<>();

        for (int i = 0; i < patientInfo.size(); i++) {
            visitCodeList.add(patientInfo.get(i).getVisitCode());
        }

        Map<Long, String> result = prescribeRepository.findDoctorIdByVisitVisitCode(visitCodeList);

        return patientInfo;
    }
}
