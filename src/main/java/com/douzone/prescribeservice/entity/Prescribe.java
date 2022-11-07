package com.douzone.prescribeservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Prescribe {
    @Id
    @Column(name = "prescribe_code")
    private Long prescribeCode;
    @Column(name = "prescribe_contents")
    private String prescribeContents;
    @Column(name = "prescribe_dt")
    private LocalDate prescribeDt;
    @Column(name = "doctor_id")
    private String doctorId;

    @ManyToOne
    @JoinColumn(name = "visit_code")
    private Visit visit;

    @ManyToOne
    @JoinColumn(name = "inspection_code")
    private InspectionType inspectionType;

    @ManyToOne
    @JoinColumn(name ="status_code")
    private Status status;
}
