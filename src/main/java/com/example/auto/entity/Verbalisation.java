package com.example.auto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor

public class Verbalisation {

    @Id
    @GeneratedValue

    private String typeVerbalisation;
    private Date dateVerbalisation;
    private int montant;

    private String usager;

}
