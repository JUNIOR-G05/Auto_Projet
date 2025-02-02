package com.example.auto.service;

import com.example.auto.Interface.AssuranceInter;
import com.example.auto.entity.Assurance;
import com.example.auto.repository.AssuranceDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssuranceService  implements AssuranceInter {


    private AssuranceDAO aRepo;

    public AssuranceService(AssuranceDAO aRepo) {
        this.aRepo = aRepo;
    }


    public List<Assurance> findAll() {
        return null;
    }

    public Assurance save(Assurance assurance) {
        return aRepo.save(assurance);
    }


    public Assurance update(Long id, Assurance assurance) {
        return null;
    }


    public Boolean delete(Long id) {
        return null;
    }

    public Assurance getByIdAss(Long id) {
        return this.aRepo.findById(id).orElse(null);
    }
}
