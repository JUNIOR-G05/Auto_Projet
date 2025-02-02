package com.example.auto.controller;


import com.example.auto.Interface.TypePersonneInter;
import com.example.auto.entity.TypePersonne;
import org.springframework.web.bind.annotation.*;


import java.util.List;


public class TypePersonneAPI {

    private final TypePersonneInter typePersonneInter;

    public TypePersonneAPI(TypePersonneInter typePersonneInter) {
        this.typePersonneInter = typePersonneInter;
    }

    public List<TypePersonne> findAll() {
        return typePersonneInter.findAll();
    }


    @PostMapping("/typepersonne")
    public TypePersonne save(TypePersonne typePersonne) {
        return typePersonneInter.save(typePersonne);
    }


    @PutMapping("/typepersonne/{id}")
    public TypePersonne update(Long id, TypePersonne typePersonne) {
        return typePersonneInter.update(id, typePersonne);
    }

    @DeleteMapping("/typepersonne/{id}")
    public Boolean delete(Long id) {
        return typePersonneInter.delete(id);
    }


    @GetMapping("/typepersonne/{id}")
    public TypePersonne getByIdTypePer(Long id) {
        return typePersonneInter.getByIdTypePer(id);
    }




}
