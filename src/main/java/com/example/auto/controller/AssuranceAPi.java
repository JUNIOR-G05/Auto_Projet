package com.example.auto.controller;


import com.example.auto.Interface.AssuranceInter;
import com.example.auto.entity.Assurance;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/assurance")

public class AssuranceAPi {

    private final AssuranceInter assuranceInter;



    public AssuranceAPi(AssuranceInter assuranceInter) {
        this.assuranceInter = assuranceInter;
    }

    public List<Assurance> findAll() {
        return assuranceInter.findAll();
    }
     @PostMapping("/assurance")
    public Assurance save(Assurance assurance) {
        return assuranceInter.save(assurance);
    }

    @PutMapping("/assurance/{id}")
    public Assurance update(@PathVariable Long id, @RequestBody Assurance assurance) {
        return assuranceInter.update(id, assurance);
    }
    @DeleteMapping("/assurance/{id}")
    public Boolean delete(@PathVariable Long id) {
        return assuranceInter.delete(id);
    }

    @GetMapping("/assurance/{id}")
    public Assurance getByIdAss(@PathVariable Long id) {
        return assuranceInter.getByIdAss(id);
    }

}
