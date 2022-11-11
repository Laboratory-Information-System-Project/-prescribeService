package com.douzone.prescribeservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Vessel {

    @Id
    private String vesselCode;
    private String vesselName;
    private String vesselSize;
    private String vesselPurpose;

    @ManyToOne
    @JoinColumn(name = "sample_code")
    private SampleType sampleType;
}
