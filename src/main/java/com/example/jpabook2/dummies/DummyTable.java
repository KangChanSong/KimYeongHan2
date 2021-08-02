package com.example.jpabook2.dummies;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class DummyTable {

    @Id @GeneratedValue
    @Column(name ="dummy_id")
    private Long id;

    private String dummyName;
    private int dummyAge;
}
