package com.example.auto.service;

import com.example.auto.Interface.TypeRouteInter;
import com.example.auto.entity.TypeRoute;

import java.util.List;

public class TypeRouteService  implements TypeRouteInter {


    private final TypeRouteInter trRepo;

    public TypeRouteService(TypeRouteInter trRepo) {
        this.trRepo = trRepo;
    }

    @Override
    public List<TypeRoute> findAll() {
        return null;
    }

    public TypeRoute save(TypeRoute typeRoute) {
        return trRepo.save(typeRoute);
    }

    public TypeRoute update(Long id, TypeRoute typeRoute) {
        return null;
    }

    public Boolean delete(Long id) {
        return null;
    }

    public TypeRoute getByIdTypeRou(Long id) {
        return null;
    }
}
