package com.example.auto.service;


import com.example.auto.Interface.FicheInformationInter;
import com.example.auto.entity.FicheInformation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FicheInformationService  implements FicheInformationInter {

    private FicheInformationInter ficheInformationInter;

    public FicheInformationService(FicheInformationInter ficheInformationInter) {
        this.ficheInformationInter = ficheInformationInter;
    }

    @Override
    public List<FicheInformation> findAll() {
        return null;
    }

    public FicheInformation save(FicheInformation ficheInformation) {
        return ficheInformationInter.save(ficheInformation);
    }
    public List<FicheInformation> getFicheInformations() {
        return ficheInformationInter.findAll();
    }
    public FicheInformation update(Long id, FicheInformation ficheInformation ) {
        return null;
    }

    public Boolean delete(Long id) {
        return null;
    }

    public FicheInformation getByIdFiche(Long id) {
        return this.ficheInformationInter.getByIdFiche(id);
    }




}
