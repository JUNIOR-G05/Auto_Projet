package com.example.auto.controller;


import com.example.auto.Interface.SignalisationInter;
import com.example.auto.entity.Signalisation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@CrossOrigin("*")
@RestController
public class SignalisationAPI {

    private final SignalisationInter signalisationInter;


    public SignalisationAPI(SignalisationInter signalisationInter) {
        this.signalisationInter = signalisationInter;
    }

    public List<Signalisation> findAll() {
        return signalisationInter.findAll();
    }

    @PostMapping("/signalisation")
    public Signalisation save(Signalisation signalisation) {
        return signalisationInter.save(signalisation);
    }
    @PutMapping("/signalisation/{id}")
    public Signalisation update(Long id, Signalisation signalisation) {
        return signalisationInter.update(id, signalisation);
    }
    @DeleteMapping("/signalisation/{id}")
    public Boolean delete(Long id) {
        return signalisationInter.delete(id);
    }

    @GetMapping("/signalisation/{id}")
    public Signalisation getByIdSig(Long id) {
        return signalisationInter.getByIdSig(id);
    }
}
