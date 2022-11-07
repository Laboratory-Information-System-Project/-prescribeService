package com.douzone.prescribeservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Table
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Visit {
    @Id
    private Long visitCode;
    private LocalDate visitDt;
    private String visitStatus;

    @ManyToOne
    @JoinColumn(name="patient_no")
    private Patient patient;

}
