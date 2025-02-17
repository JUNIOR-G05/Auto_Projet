package com.example.auto.service;

import com.example.auto.Interface.AssuranceInter;
import com.example.auto.entity.Assurance;
import com.example.auto.repository.AssuranceDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssuranceService implements AssuranceInter {


    private final AssuranceDAO aRepo;

    public AssuranceService(AssuranceDAO aRepo) {
        this.aRepo = aRepo;
    }


    public List<Assurance> findAll() {
        return aRepo.findAll();
    }

    public Assurance save(Assurance assurance) {
        return aRepo.save(assurance);
    }


    public Assurance update(Long id, Assurance assurance) {
        Assurance assurance1 = aRepo.findById(id).orElse(null);
        if (assurance1 != null) {
            assurance1.setNom(assurance.getNom());
            return aRepo.save(assurance1);

        }
        return null;
    }


    public Boolean delete(Long id) {
        aRepo.deleteById(id);
        return true;
    }


    public Assurance getByIdAss(Long id) {
        return this.aRepo.findById(id).orElse(null);
    }
}
