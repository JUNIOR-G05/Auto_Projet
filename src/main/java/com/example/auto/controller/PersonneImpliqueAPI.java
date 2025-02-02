package com.example.auto.controller;


import com.example.auto.Interface.PersonneImpliqueInter;
import com.example.auto.entity.PersonneImplique;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/personneImplique")
public class PersonneImpliqueAPI {
    private final PersonneImpliqueInter personneImpliqueInter;


    public PersonneImpliqueAPI(PersonneImpliqueInter personneImpliqueInter) {
        this.personneImpliqueInter = personneImpliqueInter;
    }

    public List<PersonneImplique> findAll() {
        return personneImpliqueInter.findAll();
    }


    @PostMapping("/personneImplique")
    public PersonneImplique save(@RequestBody PersonneImplique personneImplique) {
        return personneImpliqueInter.save(personneImplique);
    }

    @PutMapping("/personneImplique/{id}")
    public PersonneImplique update(@PathVariable Long id, @RequestBody PersonneImplique personneImplique) {
        return personneImpliqueInter.update(id, personneImplique);
    }

    @DeleteMapping("/personneImplique/{id}")
    public Boolean delete(@PathVariable Long id) {
        return personneImpliqueInter.delete(id);
    }

    @GetMapping("/personneImplique/{id}")
    public PersonneImplique getByIdPer(@PathVariable Long id) {
        return personneImpliqueInter.getByIdPer(id);
    }
}
