package com.example.auto.service;


import com.example.auto.Interface.SignalisationInter;
import com.example.auto.entity.Signalisation;
import com.example.auto.repository.SignalisationDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignalisationService implements SignalisationInter {


    private final SignalisationDAO sRepo;

    public SignalisationService(SignalisationDAO sRepo) {
        this.sRepo = sRepo;
    }

    @Override
    public List<Signalisation> findAll() {
        return sRepo.findAll();
    }

    public Signalisation save(Signalisation signalisation) {
        return sRepo.save(signalisation);
    }

    public Signalisation update(Long id, Signalisation signalisation ) {
        return sRepo.save(signalisation);
    }

    public Boolean delete(Long id) {
        sRepo.deleteById(id);
        return true;
    }

    public Signalisation getByIdSig(Long id) {
        return this.sRepo.getReferenceById(id);
    }
}
