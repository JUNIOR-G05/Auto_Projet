package com.example.auto.service;

import com.example.auto.Interface.VerbalisationInter;
import com.example.auto.entity.Verbalisation;
import com.example.auto.repository.VerbalisationDAO;

import java.util.List;

public class VerbalisationService implements VerbalisationInter {

    private VerbalisationDAO verRepo;


    public VerbalisationService(VerbalisationDAO verRepo) {
        this.verRepo = verRepo;
    }

    @Override
    public List<Verbalisation> findAll() {
        return null;
    }

    public Verbalisation save(Verbalisation verbalisation) {
        return verRepo.save(verbalisation);
    }

    public List<Verbalisation> getVerbalisations() {
        return verRepo.findAll();

    }

    public Verbalisation update(Long id, Verbalisation verbalisation) {
        return null;
    }



    public Boolean delete(Long id) {
        return null;
    }

    public Verbalisation getByIdVer(Long id) {
        return this.verRepo.findById(id).orElse(null);
    }


}
