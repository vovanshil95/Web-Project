package com.WebProject.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="oder")
public class OrderEntity {
    @Id
    int id;

    @Column(name = "status", nullable = false, length = 64)
    String status;


}
