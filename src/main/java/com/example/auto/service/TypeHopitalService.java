package com.example.auto.service;

import com.example.auto.Interface.TypeHopitalInter;
import com.example.auto.entity.TypeHopital;
import com.example.auto.repository.TypeHopitalDAO;
import org.springframework.stereotype.Service;

import java.util.List;
 @Service
public class   TypeHopitalService implements TypeHopitalInter {

    private final TypeHopitalDAO tRepo;

    public TypeHopitalService(TypeHopitalDAO tRepo) {
        this.tRepo = tRepo;
    }

    @Override
    public List<TypeHopital> findAll() {
        return tRepo.findAll();
    }

    public TypeHopital save(TypeHopital typeHopital) {
        return tRepo.save(typeHopital);
    }

    public TypeHopital update(Long id, TypeHopital typeHopital ) {
        return tRepo.save(typeHopital);
    }

    public Boolean delete(Long id) {
        tRepo.deleteById(id);return true;
    }

    public TypeHopital getByIdTypeHop(Long id) {
        return this.tRepo.findById(id).orElse(null);
    }

}
