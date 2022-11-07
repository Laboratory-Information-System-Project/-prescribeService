package com.douzone.prescribeservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Status {
    @Id
    @Column(name = "status_code")
    private String statusCode;
    @Column(name = "status_name")
    private String statusName;

}
