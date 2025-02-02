package com.example.auto.service;


import com.example.auto.entity.TypePersonne;
import com.example.auto.repository.TypePersonneDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypePersonneService {

    private TypePersonneDAO tRepo;

    public TypePersonneService(TypePersonneDAO tRepo) {
        this.tRepo = tRepo;
    }

    public List<TypePersonne> findAll() {
        return tRepo.findAll();
    }

    public TypePersonne save(TypePersonne typePersonne) {
        return tRepo.save(typePersonne);
    }

    public TypePersonne update(Long id, TypePersonne typePersonne) {
        return tRepo.save(typePersonne);
    }

    public Boolean delete(Long id) {
        tRepo.deleteById(id);
        return true;
    }

    public TypePersonne getByIdTypePer(Long id) {
        return this.tRepo.findById(id).orElse(null);
    }

}
