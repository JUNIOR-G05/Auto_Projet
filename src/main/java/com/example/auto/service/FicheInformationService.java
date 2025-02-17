package com.example.auto.service;


import com.example.auto.Interface.FicheInformationInter;
import com.example.auto.entity.FicheInformation;
import com.example.auto.repository.FicheInfotmationDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FicheInformationService  implements FicheInformationInter {

    private final FicheInfotmationDAO ficheInformationInter;

    public FicheInformationService(FicheInfotmationDAO ficheInformationInter) {
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
        ficheInformationInter.deleteById(id);
        return true;
    }

    public FicheInformation getByIdFiche(Long id) {
        return this.ficheInformationInter.getReferenceById(id);
    }




}
