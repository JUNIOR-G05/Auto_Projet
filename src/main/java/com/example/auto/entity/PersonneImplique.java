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
public class PersonneImplique {

    @Id
    @GeneratedValue
    private String conducteur;
    private String passager;
    private String profession;

}
