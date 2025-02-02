package com.example.auto.Interface;

import com.example.auto.entity.TypeHopital;

import java.util.List;

public interface TypeHopitalInter {

    List<TypeHopital> findAll();

    TypeHopital save(TypeHopital typeHopital);

    TypeHopital update(Long id, TypeHopital typeHopital);

    Boolean delete(Long id);

    TypeHopital getByIdTypeHop(Long id);
}
