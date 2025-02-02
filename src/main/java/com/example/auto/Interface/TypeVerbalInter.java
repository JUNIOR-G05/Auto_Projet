package com.example.auto.Interface;

import com.example.auto.entity.TypeVerbal;

import java.util.List;

public interface TypeVerbalInter {

    List<TypeVerbal> findAll();

    TypeVerbal save(TypeVerbal typeVerbal);

    TypeVerbal update(Long id, TypeVerbal typeVerbal);

    Boolean delete(Long id);

    TypeVerbal getByIdTypeVer(Long id);
}
