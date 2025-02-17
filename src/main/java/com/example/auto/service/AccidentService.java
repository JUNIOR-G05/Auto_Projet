package com.example.auto.service;

import com.example.auto.Interface.AccidentInter;
import com.example.auto.entity.Accident;
import com.example.auto.repository.AccidentDAO;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccidentService implements AccidentInter {

    private final AccidentDAO aRepo;

    public AccidentService(AccidentDAO aRepo) {
        this.aRepo = aRepo;
    }

    @Override
    public List<Accident> findAll() {
        return aRepo.findAll();
    }

    public Accident save(Accident accident) {
        return aRepo.save(accident);
    }

    public Accident update(Long id, Accident accident ) {

        Accident accident1 = aRepo.findById(id).orElse(null);
        if (accident1 != null) {
            accident1.setDescription(accident.getDescription());
            accident1.setDateAccident(accident.getDateAccident());
            accident1.setConducteur(accident.getConducteur());
            accident1.setPassagers(accident.getPassagers());
            accident1.setNombreBlesses(accident.getNombreBlesses());
            accident1.setNombreMorts(accident.getNombreMorts());
            accident1.setNombreVehicules(accident.getNombreVehicules());
            accident1.setAutreDegats(accident.getAutreDegats());
            return aRepo.save(accident1);
        }
        return null;

    }


    public Boolean delete(Long id) {
         aRepo.deleteById(id) ;
            return true;
    }

    public Accident getByIdAcc(Long id) {
        return this.aRepo.getReferenceById(id);
    }
}
