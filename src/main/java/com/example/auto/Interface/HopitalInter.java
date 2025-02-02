package com.example.auto.Interface;

import com.example.auto.entity.Hopital;

import java.util.List;

public interface HopitalInter {

    List<Hopital> findAll();

    Hopital save(Hopital hopital);

    Hopital update(Long id, Hopital hopital);

    Boolean delete(Long id);

    public Hopital getByIdHop(Long id) ;
}
