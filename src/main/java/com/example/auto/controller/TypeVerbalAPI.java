package com.example.auto.controller;

import com.example.auto.Interface.TypeVerbalInter;
import com.example.auto.entity.TypeVerbal;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
public class TypeVerbalAPI {

    private final TypeVerbalInter typeVerbalInter;


    public TypeVerbalAPI(TypeVerbalInter typeVerbalInter) {
        this.typeVerbalInter = typeVerbalInter;
    }

    public List<TypeVerbal> findAll() {
        return typeVerbalInter.findAll();
    }

    @PostMapping("/typeVerbal")

    public TypeVerbal save(@RequestBody TypeVerbal typeVerbal) {
        return typeVerbalInter.save(typeVerbal);
    }

    @PutMapping("/typeVerbal/{id}")

    public TypeVerbal update(@PathVariable Long id, @RequestBody TypeVerbal typeVerbal) {
        return typeVerbalInter.update(id, typeVerbal);
    }

    @DeleteMapping("/typeVerbal/{id}")

    public Boolean delete(@PathVariable Long id) {
        return typeVerbalInter.delete(id);
    }

    @GetMapping("/typeVerbal/{id}")

    public TypeVerbal getByIdTypeVer(@PathVariable Long id) {
        return typeVerbalInter.getByIdTypeVer(id);
    }
}
