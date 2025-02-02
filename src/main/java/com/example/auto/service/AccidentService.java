package com.example.auto.service;

import com.example.auto.Interface.AccidentInter;
import com.example.auto.entity.Accident;
import com.example.auto.repository.AccidentDAO;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccidentService implements AccidentInter {

    private AccidentDAO aRepo;

    public AccidentService(AccidentDAO aRepo) {
        this.aRepo = aRepo;
    }

    @Override
    public List<Accident> findAll() {
        return null;
    }

    public Accident save(Accident accident) {
        return aRepo.save(accident);
    }
    public List<Accident> getAccidents() {
        return aRepo.findAll();

    }
    public Accident update(Long id, Accident accident ) {
        return null;
    }


    public Boolean delete(Long id) {
        return null;
    }

    public Accident getByIdAcc(Long id) {
        return this.aRepo.findById(id).orElse(null);
    }
}
