package com.example.auto.controller;



import com.example.auto.Interface.TypeHopitalInter;
import com.example.auto.entity.TypeHopital;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/typehopital")
public class TypeHopitalAPI {

    private final TypeHopitalInter typeHopitalInter;

    public TypeHopitalAPI(TypeHopitalInter typeHopitalInter) {
        this.typeHopitalInter = typeHopitalInter;
    }

    public List<TypeHopital> findAll() {
        return typeHopitalInter.findAll();
    }

    @PostMapping("/typehopital")
    public TypeHopital save(@RequestBody TypeHopital typeHopital) {
        return typeHopitalInter.save(typeHopital);
    }

    @PutMapping("/typehopital/{id}")
    public TypeHopital update(@PathVariable Long id, @RequestBody TypeHopital typeHopital) {
        return typeHopitalInter.update(id, typeHopital);
    }

    @DeleteMapping("/typehopital/{id}")
    public Boolean delete(@PathVariable Long id) {
        return typeHopitalInter.delete(id);
    }

    @GetMapping("/typehopital/{id}")
    public TypeHopital getByIdTypeHop(@PathVariable Long id) {
        return typeHopitalInter.getByIdTypeHop(id);
    }

}
