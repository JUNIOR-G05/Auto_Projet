package com.example.auto.service;

import com.example.auto.Interface.HopitalInter;
import com.example.auto.entity.Hopital;
import com.example.auto.repository.HopitalDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class HopitalService implements HopitalInter {


    private final HopitalDAO hRepo;

    public HopitalService(HopitalDAO hRepo) {
        this.hRepo = hRepo;
    }

    @Override
    public List<Hopital> findAll() {
        return hRepo.findAll();
    }

    public Hopital save(Hopital hopital) {
        return hRepo.save(hopital);
    }

    public Hopital update(Long id, Hopital hopital ) {
        return hRepo.save(hopital);
    }


    public Boolean delete(Long id) {
        hRepo.deleteById(id);
        return true;
    }

    public Hopital getByIdHop(Long id) {
        return this.hRepo.findById(id).orElse(null);
    }
}