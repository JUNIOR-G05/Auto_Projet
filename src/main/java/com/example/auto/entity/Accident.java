package com.example.auto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Entity
@Getter
@Setter
@NoArgsConstructor


public class Accident {

    @Id
    @GeneratedValue
    private String description;
    private Date dateAccident;
    private String conducteur;
    private int passagers;
    private int nombreBlesses;
    private int nombreMorts;
    private int nombreVehicules;

    private String autreDegats;

}
