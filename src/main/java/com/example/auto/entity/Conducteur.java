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
public class Conducteur {

    @Id
    @GeneratedValue
    private String numeroPiece;
    private Boolean permis;

}
