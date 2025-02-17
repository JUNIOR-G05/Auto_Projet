package com.example.auto.service;

import com.example.auto.Interface.TypeVerbalInter;
import com.example.auto.entity.TypeVerbal;
import com.example.auto.repository.TypeVerbalDAO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeVerbalService  implements TypeVerbalInter {

    private final TypeVerbalDAO tvRepo;


    public TypeVerbalService(TypeVerbalDAO tvRepo) {
        this.tvRepo = tvRepo;
    }

    public List<TypeVerbal> findAll() {
        return tvRepo.findAll();
    }

    public TypeVerbal save(TypeVerbal typeVerbal) {
        return tvRepo.save(typeVerbal);
    }

    public TypeVerbal update(Long id, TypeVerbal typeVerbal) {
        return tvRepo.save(typeVerbal);
    }

    public Boolean delete(Long id) {
        tvRepo.deleteById(id);return true;
    }

    public TypeVerbal getByIdTypeVer(Long id) {
        return tvRepo.getReferenceById(id);
    }

}
