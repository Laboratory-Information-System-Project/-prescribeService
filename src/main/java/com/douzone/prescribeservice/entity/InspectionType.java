package com.douzone.prescribeservice.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "inspection_type")
// @Getter
// @Setter
// @EqualsAndHashCode
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InspectionType {
    @Id
    @Column(name = "inspection_code")
    private String inspectionCode;
    @Column(name = "inspection_name")
    private String inspectionName;
    private String unit;
    private Double baseline;

    @ManyToOne
    @JoinColumn(name = "order_code")
    private Order order;

    @OneToOne
    @JoinColumn(name = "vessel_code")
    private Vessel vessel;
}
