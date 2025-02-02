package com.example.auto.service;

import com.example.auto.Interface.TypeVerbalInter;
import com.example.auto.entity.TypeVerbal;

import java.util.List;

public class TypeVerbalService  implements TypeVerbalInter {

    private final TypeVerbalInter tvRepo;


    public TypeVerbalService(TypeVerbalInter tvRepo) {
        this.tvRepo = tvRepo;
    }

    public List<TypeVerbal> findAll() {
        return tvRepo.findAll();
    }

    public TypeVerbal save(TypeVerbal typeVerbal) {
        return tvRepo.save(typeVerbal);
    }

    public TypeVerbal update(Long id, TypeVerbal typeVerbal) {
        return tvRepo.update(id, typeVerbal);
    }

    public Boolean delete(Long id) {
        return tvRepo.delete(id);
    }

    public TypeVerbal getByIdTypeVer(Long id) {
        return tvRepo.getByIdTypeVer(id);
    }

}
