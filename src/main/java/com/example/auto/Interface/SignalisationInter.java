package com.example.auto.Interface;


import com.example.auto.entity.Signalisation;

import java.util.List;

public interface SignalisationInter {

    List<Signalisation> findAll();

    Signalisation save(Signalisation signalisation);

    Signalisation update(Long id, Signalisation signalisation);

    Boolean delete(Long id);

    public Signalisation getByIdSig(Long id) ;

}
