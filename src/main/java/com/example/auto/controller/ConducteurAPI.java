package com.example.auto.controller;


import com.example.auto.Interface.ConducteurInter;
import com.example.auto.entity.Conducteur;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/conducteur")
public class ConducteurAPI {

    private final ConducteurInter conducteurInter;

    public ConducteurAPI(ConducteurInter conducteurInter) {
        this.conducteurInter = conducteurInter;
    }

    public List<Conducteur> findAll() {
        return conducteurInter.findAll();
    }

    @PostMapping("/conducteur")
    public Conducteur save(Conducteur conducteur) {
        return conducteurInter.save(conducteur);
    }

    @PutMapping("/conducteur/{id}")
    public Conducteur update(Long id, Conducteur conducteur) {
        return conducteurInter.update(id, conducteur);
    }

    @DeleteMapping("/conducteur/{id}")
    public Boolean delete(Long id) {
        return conducteurInter.delete(id);

    }
    @GetMapping("/conducteur/{id}")
    public Conducteur getByIdCond(Long id) {
        return conducteurInter.getByIdCond(id);
    }
}
