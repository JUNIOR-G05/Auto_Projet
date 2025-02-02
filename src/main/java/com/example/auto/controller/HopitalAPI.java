package com.example.auto.controller;

import com.example.auto.Interface.HopitalInter;
import com.example.auto.entity.Hopital;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HopitalAPI {
    private final HopitalInter hopitalInter;

    public HopitalAPI(HopitalInter hopitalInter) {
        this.hopitalInter = hopitalInter;
    }

    public List<Hopital> findAll() {
        return hopitalInter.findAll();
    }


    @PostMapping("/hopital")
    public Hopital save(@RequestBody Hopital hopital) {
        return hopitalInter.save(hopital);
    }

    @PutMapping("/hopital/{id}")
    public Hopital update(@PathVariable Long id, Hopital hopital) {
        return hopitalInter.update(id, hopital);
    }

    @DeleteMapping("/hopital/{id}")
    public Boolean delete(@PathVariable Long id) {
        return hopitalInter.delete(id);
    }

    @GetMapping("/hopital/{id}")
    public Hopital getByIdHop(@PathVariable Long id) {
        return hopitalInter.getByIdHop(id);
    }
}