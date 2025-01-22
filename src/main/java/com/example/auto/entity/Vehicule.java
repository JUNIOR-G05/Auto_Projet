package com.example.auto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor

public class Vehicule {

    @Id
    @GeneratedValue
    private Long id;

    private String numeroPlaque;
    private String numeroChassis;

    private String typeVehicule;
    private String parametreVehicule;
}
