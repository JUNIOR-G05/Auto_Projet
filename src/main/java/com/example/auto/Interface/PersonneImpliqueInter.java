package com.example.auto.Interface;

import com.example.auto.entity.PersonneImplique;

import java.util.List;

public interface PersonneImpliqueInter {

    List<PersonneImplique> findAll();

    PersonneImplique save(PersonneImplique personneImplique);

    PersonneImplique update(Long id, PersonneImplique personneImplique);

    Boolean delete(Long id);

    public PersonneImplique getByIdPer(Long id) ;
}
