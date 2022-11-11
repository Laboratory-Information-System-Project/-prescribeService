package com.douzone.prescribeservice.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Table
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Visit implements Serializable {

    @Id
    @Column(name = "visit_code")
    private Long visitCode;
    @Column(name = "visit_dt")
    private LocalDateTime visitDt;
    @Column(name = "visit_status")
    private String visitStatus;

    @ManyToOne
    @JoinColumn(name="patient_no")
    private Patient patient;

}
