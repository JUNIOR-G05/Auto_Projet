package com.example.auto.Interface;

import com.example.auto.entity.TypeRoute;

import java.util.List;

public interface TypeRouteInter {

    List<TypeRoute> findAll();

    TypeRoute save(TypeRoute typeRoute);

    TypeRoute update(Long id, TypeRoute typeRoute);

    Boolean delete(Long id);

    TypeRoute getByIdTypeRou(Long id);
}
