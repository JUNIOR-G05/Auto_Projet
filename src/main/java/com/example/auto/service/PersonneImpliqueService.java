package com.example.auto.service;


import com.example.auto.Interface.PersonneImpliqueInter;
import com.example.auto.entity.PersonneImplique;
import com.example.auto.repository.PersonneImpliqueDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonneImpliqueService implements PersonneImpliqueInter {

   private final PersonneImpliqueDAO pRepo;

    public PersonneImpliqueService(PersonneImpliqueDAO pRepo) {
        this.pRepo = pRepo;
    }

    @Override
    public List<PersonneImplique> findAll() {
        return pRepo.findAll();
    }

    public PersonneImplique save(PersonneImplique personneImplique) {
        return pRepo.save(personneImplique);
    }

    public PersonneImplique update(Long id, PersonneImplique personneImplique ) {
        return pRepo.save(personneImplique);
    }

    public Boolean delete(Long id) {
        pRepo.deleteById(id);
        return true;
    }

    public PersonneImplique getByIdPer(Long id) {
        return this.pRepo.getReferenceById(id);
    }
}
