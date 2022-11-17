package com.douzone.prescribeservice.service.patient;

import com.douzone.prescribeservice.entity.Prescribe;
import com.douzone.prescribeservice.repository.patient.PatientRepository;
import com.douzone.prescribeservice.repository.prescribe.PrescribeRepository;
import com.douzone.prescribeservice.util.ConvertMap;
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
    public List<Map<String, Object>> findPatient(Long patientNo) {
        List<Prescribe> prescribes = patientRepository.findPatientInfo(patientNo);
        List<Map<String,Object>> result = new ArrayList<>();

        for (int i = 0; i < prescribes.size(); i++) {
            Map<String, Object> visitInfo = ConvertMap.convertToMap(prescribes.get(i));
            result.add(visitInfo);
        }


        return result;
    }
}
