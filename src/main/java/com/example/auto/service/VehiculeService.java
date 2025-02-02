package com.example.auto.service;

import com.example.auto.Interface.VehiculeInter;
import com.example.auto.entity.Vehicule;
import com.example.auto.repository.VehiculeDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculeService implements VehiculeInter{


   private VehiculeDAO vRepo;

    public VehiculeService(VehiculeDAO vRepo) {
         this.vRepo = vRepo;
    }

    public List<Vehicule> findAll() {
        return vRepo.findAll();
    }

    public Vehicule save(Vehicule vehicule) {
        return vRepo.save(vehicule);
    }

    public Vehicule update(Long id, Vehicule vehicule) {
        return vRepo.save(vehicule);
    }

    public Boolean delete(Long id) {
        vRepo.deleteById(id);
        return true;
    }

    public Vehicule getByIdVeh(Long id) {
        return this.vRepo.findById(id).orElse(null);
    }


}
