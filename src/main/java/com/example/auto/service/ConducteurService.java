package com.example.auto.service;


import com.example.auto.Interface.ConducteurInter;
import com.example.auto.entity.Conducteur;
import com.example.auto.repository.ConducteurDAO;
import org.aspectj.weaver.loadtime.definition.Definition;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConducteurService implements ConducteurInter {

    private final ConducteurDAO conducteurInter;

    public ConducteurService(ConducteurDAO conducteurInter) {
        this.conducteurInter = conducteurInter;
    }

    @Override
    public List<Conducteur> findAll() {
        return null;
    }

    public Conducteur save(Conducteur conducteur) {
        return conducteurInter.save(conducteur);
    }

    public Conducteur update(Long id, Conducteur conducteur) {
        return null;
    }

    public Boolean delete(Long id) {
        return null;
    }

    public Conducteur getByIdCond(Long id) {
        return conducteurInter.getReferenceById(id);
    }
}
