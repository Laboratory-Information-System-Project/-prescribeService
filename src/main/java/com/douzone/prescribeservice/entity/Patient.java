package com.douzone.prescribeservice.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

    @Id
    @Column(name = "patient_no")
    private Long patientNo;
    @Column(name = "patient_name")
    private String patientName;
    @Column(name = "patient_age")
    private Integer patientAge;
    @Column(name = "patient_blood_type")
    private String patientBloodType;
    @Column(name = "patient_height")
    private Integer patientHeight;
    @Column(name = "patient_weight")
    private Integer patientWeight;
    @Column(name = "patient_address")
    private String patientAddress;
    @Column(name = "patient_phonenumber")
    private String patientPhoneNumber;
    @Column(name = "patient_resident_number")
    private String patientResidentNumber;
    @Column(name = "patient_gender")
    private String patientGender;


}
