package com.douzone.prescribeservice.domain;

import com.douzone.prescribeservice.entity.Patient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatientInfoDto {

    public PatientInfoDto(Long patientNo, String patientName, Integer patientAge, String patientBloodType, Integer patientHeight, Integer patientWeight, String patientAddress, String patientPhoneNumber, String patientResidentNumber, String patientGender, Long visitCode, LocalDateTime visitDt, String visitStatus) {
        this.patientNo = patientNo;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientBloodType = patientBloodType;
        this.patientHeight = patientHeight;
        this.patientWeight = patientWeight;
        this.patientAddress = patientAddress;
        this.patientPhoneNumber = patientPhoneNumber;
        this.patientResidentNumber = patientResidentNumber;
        this.patientGender = patientGender;
        this.visitCode = visitCode;
        this.visitDt = visitDt;
        this.visitStatus = visitStatus;
    }

    private Long patientNo;
    private String patientName;
    private Integer patientAge;
    private String patientBloodType;
    private Integer patientHeight;
    private Integer patientWeight;
    private String patientAddress;
    private String patientPhoneNumber;
    private String patientResidentNumber;
    private String patientGender;
    private Long visitCode;
    private LocalDateTime visitDt;
    private String visitStatus;
    private String doctorId;
}
