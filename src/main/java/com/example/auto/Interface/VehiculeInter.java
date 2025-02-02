package com.example.auto.Interface;

import com.example.auto.entity.Vehicule;

import java.util.List;

public interface VehiculeInter {
   List<Vehicule> findAll();

    Vehicule save(Vehicule vehicule);

    Vehicule update(Long id, Vehicule vehicule);

    Boolean delete(Long id);

    public Vehicule getByIdVeh(Long id) ;



}
