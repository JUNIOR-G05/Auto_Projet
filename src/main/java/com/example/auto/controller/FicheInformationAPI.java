package com.example.auto.controller;


import com.example.auto.Interface.FicheInformationInter;
import com.example.auto.entity.FicheInformation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/ficheInformation")
public class FicheInformationAPI {

    private final FicheInformationInter ficheInformationInter;

    public FicheInformationAPI(FicheInformationInter ficheInformationInter) {
        this.ficheInformationInter = ficheInformationInter;
    }

    public List<FicheInformation> findAll() {
        return ficheInformationInter.findAll();
    }

    @PostMapping("/ficheInformation")
    public FicheInformation save(@RequestBody FicheInformation ficheInformation) {
        return ficheInformationInter.save(ficheInformation);
    }

    @PutMapping("/ficheInformation/{id}")
    public FicheInformation update(@PathVariable Long id, @RequestBody FicheInformation ficheInformation) {
        return ficheInformationInter.update(id, ficheInformation);
    }

    @DeleteMapping("/ficheInformation/{id}")
    public Boolean delete(@PathVariable Long id) {
        return ficheInformationInter.delete(id);
    }

    @GetMapping("/ficheInformation/{id}")
    public FicheInformation getByIdFiche(@PathVariable Long id) {
        return ficheInformationInter.getByIdFiche(id);
    }
}
