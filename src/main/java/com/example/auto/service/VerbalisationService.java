package com.example.auto.service;

import com.example.auto.Interface.VerbalisationInter;
import com.example.auto.entity.Verbalisation;
import com.example.auto.repository.VerbalisationDAO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VerbalisationService implements VerbalisationInter {

    private final VerbalisationDAO verRepo;


    public VerbalisationService(VerbalisationDAO verRepo) {
        this.verRepo = verRepo;
    }

    @Override
    public List<Verbalisation> findAll() {
        return verRepo.findAll();
    }

    public Verbalisation save(Verbalisation verbalisation) {
        return verRepo.save(verbalisation);
    }



    public Verbalisation update(Long id, Verbalisation verbalisation) {
        return null;
    }

    public Boolean delete(Long id) {
        verRepo.deleteById(id);return true;
    }

    public Verbalisation getByIdVer(Long id) {
        return this.verRepo.findById(id).orElse(null);
    }


}
