package com.douzone.prescribeservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SampleType {

    @Id
    @Column(name = "sample_code")
    private String sampleCode;
    @Column(name = "sample_name")
    private String sampleName;
}