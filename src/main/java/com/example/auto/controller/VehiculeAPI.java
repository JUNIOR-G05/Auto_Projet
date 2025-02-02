package com.example.auto.controller;

import com.example.auto.Interface.VehiculeInter;
import com.example.auto.entity.Vehicule;

import java.util.List;

public class VehiculeAPI {

    private final VehiculeInter vehiculeInter;

    public VehiculeAPI(VehiculeInter vehiculeInter) {
        this.vehiculeInter = vehiculeInter;
    }

    public List<Vehicule> findAll() {
        return vehiculeInter.findAll();
    }

    public Vehicule save(Vehicule vehicule) {
        return vehiculeInter.save(vehicule);
    }

    public Vehicule update(Long id, Vehicule vehicule) {
        return vehiculeInter.update(id, vehicule);
    }

    public Boolean delete(Long id) {
        return vehiculeInter.delete(id);
    }

    public Vehicule getByIdVeh(Long id) {
        return vehiculeInter.getByIdVeh(id);
    }


}
