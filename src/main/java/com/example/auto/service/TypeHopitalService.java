package com.example.auto.service;

import com.example.auto.Interface.TypeHopitalInter;
import com.example.auto.entity.TypeHopital;
import com.example.auto.repository.TypeHopitalDAO;
import org.springframework.stereotype.Service;

import java.util.List;
 @Service
public class   TypeHopitalService implements TypeHopitalInter {

    private TypeHopitalDAO tRepo;

    public TypeHopitalService(TypeHopitalDAO tRepo) {
        this.tRepo = tRepo;
    }

    @Override
    public List<TypeHopital> findAll() {
        return null;
    }

    public TypeHopital save(TypeHopital typeHopital) {
        return tRepo.save(typeHopital);
    }

    public List<TypeHopital> getTypeHopitals() {
        return tRepo.findAll();
    }

    public TypeHopital update(Long id, TypeHopital typeHopital ) {
        return null;
    }

    public Boolean delete(Long id) {
        return null;
    }

    public TypeHopital getByIdTypeHop(Long id) {
        return this.tRepo.findById(id).orElse(null);
    }

}
