package com.douzone.prescribeservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {

    @Id
    @Column(name = "order_code")
    private String orderCode;
    @Column(name = "order_name")
    private String orderName;
}
