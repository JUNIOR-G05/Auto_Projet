package com.example.auto.controller;


import com.example.auto.Interface.AccidentInter;
import com.example.auto.entity.Accident;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/accident")
public class AccidentAPI {

    private final AccidentInter accidentInter;

    public AccidentAPI(AccidentInter accidentInter) {
        this.accidentInter = accidentInter;
    }

    public List<Accident> findAll() {
        return accidentInter.findAll();
    }

    @PostMapping("/accident")
    public Accident save(@RequestBody Accident accident) {
        return accidentInter.save(accident);
    }

    @PutMapping("/accident/{id}")
    public Accident update(@PathVariable Long id, @RequestBody Accident accident) {
        return accidentInter.update(id, accident);
    }

    @DeleteMapping("/accident/{id}")
    public Boolean delete(@PathVariable Long id) {
        return accidentInter.delete(id);
    }

    @GetMapping("/accident/{id}")
    public Accident getByIdAcc(@PathVariable Long id) {
        return accidentInter.getByIdAcc(id);
    }
}
