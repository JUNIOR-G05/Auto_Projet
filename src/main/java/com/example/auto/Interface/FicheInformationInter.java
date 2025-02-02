package com.example.auto.Interface;

import com.example.auto.entity.FicheInformation;

import java.util.List;

public interface FicheInformationInter {

    List<FicheInformation> findAll();

    FicheInformation save(FicheInformation ficheInformation);

    FicheInformation update(Long id, FicheInformation ficheInformation);

    Boolean delete(Long id);

    public FicheInformation getByIdFiche(Long id) ;
}
