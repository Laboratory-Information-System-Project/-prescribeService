package com.douzone.prescribeservice.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "order_slip")
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
