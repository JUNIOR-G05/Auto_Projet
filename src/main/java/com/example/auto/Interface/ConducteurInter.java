package com.example.auto.Interface;

import com.example.auto.entity.Conducteur;

import java.util.List;

public interface ConducteurInter {

    List<Conducteur> findAll();

    Conducteur save(Conducteur conducteur);

    Conducteur update(Long id, Conducteur conducteur);

    Boolean delete(Long id);

    public Conducteur getByIdCond(Long id) ;
}
