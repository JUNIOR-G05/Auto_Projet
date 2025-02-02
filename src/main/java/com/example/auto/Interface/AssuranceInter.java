package com.example.auto.Interface;

import com.example.auto.entity.Assurance;

import java.util.List;

public interface AssuranceInter {

    List<Assurance> findAll();

    Assurance save(Assurance assurance);

    Assurance update(Long id, Assurance assurance);

    Boolean delete(Long id);

    public Assurance getByIdAss(Long id) ;
}
