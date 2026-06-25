package org.example.curdoperationsbyparams.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Description {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int did;
    private String model;
    private int yom;
}
