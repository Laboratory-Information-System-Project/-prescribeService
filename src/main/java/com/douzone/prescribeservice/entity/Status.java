package com.douzone.prescribeservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inspection_status")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Status {
    @Id
    @Column(name = "status_code")
    private String statusCode;
    @Column(name = "status_name")
    private String statusName;

}
