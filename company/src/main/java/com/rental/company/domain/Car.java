package com.rental.company.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    private Long id;

    @Column
    private String manufcter;

    @Column
    private String model;

    @Column
    private Integer doors;
}
