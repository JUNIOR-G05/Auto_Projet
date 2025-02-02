package com.example.auto.Interface;

import com.example.auto.entity.Accident;

import java.util.List;

public interface AccidentInter {


    List<Accident> findAll();

    Accident save(Accident accident);

    Accident update(Long id, Accident accident);

    Boolean delete(Long id);

    public Accident getByIdAcc(Long id) ;
}
