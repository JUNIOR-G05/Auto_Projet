package com.example.auto.controller;


import com.example.auto.Interface.TypeRouteInter;
import com.example.auto.entity.TypeRoute;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public class TypeRouteAPI {

    private final TypeRouteInter typeRouteInter;

    public TypeRouteAPI(TypeRouteInter typeRouteInter) {
        this.typeRouteInter = typeRouteInter;
    }

    public List<TypeRoute> findAll() {
        return typeRouteInter.findAll();
    }

    @PostMapping("/typeroute")

    public TypeRoute save(@RequestBody TypeRoute typeRoute) {
        return typeRouteInter.save(typeRoute);
    }


    @PutMapping("/typeroute/{id}")

    public TypeRoute update(@PathVariable Long id, @RequestBody TypeRoute typeRoute) {
        return typeRouteInter.update(id, typeRoute);
    }

    @DeleteMapping("/typeroute/{id}")

    public Boolean delete(@PathVariable Long id) {
        return typeRouteInter.delete(id);
    }

    @GetMapping("/typeroute/{id}")

    public TypeRoute getByIdTypeRou(@PathVariable Long id) {
        return typeRouteInter.getByIdTypeRou(id);
    }
}
