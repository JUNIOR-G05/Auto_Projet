package com.example.auto.Interface;

import com.example.auto.entity.TypePersonne;

import java.util.List;

public interface TypePersonneInter {


    List<TypePersonne> findAll();

    TypePersonne save(TypePersonne typePersonne);

    TypePersonne update(Long id, TypePersonne typePersonne);

    Boolean delete(Long id);

    TypePersonne getByIdTypePer(Long id);

}
