package com.example.auto.controller;


import com.example.auto.Interface.VerbalisationInter;
import com.example.auto.entity.Verbalisation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")

public class VerbalisationAPI {

    private final VerbalisationInter verbalisationInter;

    public VerbalisationAPI(VerbalisationInter verbalisationInter) {
        this.verbalisationInter = verbalisationInter;
    }


    public List<Verbalisation> findAll() {
        return verbalisationInter.findAll();
    }

    @PostMapping("/verbalisation")
    public Verbalisation save(@RequestBody Verbalisation verbalisation) {
        return verbalisationInter.save(verbalisation);
    }

    @PutMapping("/verbalisation/{id}")
    public Verbalisation update(@PathVariable Long id, @RequestBody Verbalisation verbalisation) {
        return verbalisationInter.update(id, verbalisation);
    }

    @DeleteMapping("/verbalisation/{id}")
    public Boolean delete(@PathVariable Long id) {
        return verbalisationInter.delete(id);
    }

    @GetMapping("/verbalisation/{id}")
    public Verbalisation getByIdVer(@PathVariable Long id) {
        return verbalisationInter.getByIdVer(id);
    }


}
