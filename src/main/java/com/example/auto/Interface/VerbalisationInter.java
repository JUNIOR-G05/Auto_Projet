package com.example.auto.Interface;

import com.example.auto.entity.Verbalisation;

import java.util.List;

public interface VerbalisationInter {


    List<Verbalisation> findAll();

    Verbalisation save(Verbalisation verbalisation);

    Verbalisation update(Long id, Verbalisation verbalisation);

    Boolean delete(Long id);

    Verbalisation getByIdVer(Long id);
}
