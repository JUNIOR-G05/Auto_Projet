package com.example.auto.service;


import com.example.auto.Interface.ClassificationInter;
import com.example.auto.entity.Classification;
import com.example.auto.repository.ClassificationDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ClassificationService implements ClassificationInter {

    private final ClassificationDAO cRepo;

    public ClassificationService(ClassificationDAO cRepo) {
        this.cRepo = cRepo;
    }

    @Override
    public List<Classification> findAll() {
        return cRepo.findAll();
    }

    public Classification save(Classification classification) {
        return cRepo.save(classification);
    }

    public Classification update(Long id, Classification classification ) {

        Classification classification1 = cRepo.findById(id).orElse(null);
        if (classification1 != null) {
            classification1.setNom(classification.getNom());
            return cRepo.save(classification1);
        }
        return null;
    }

    public Boolean delete(Long id) {
        cRepo.deleteById(id);
        return true;
    }

    public Classification getByIdClass(Long id) {
        return this.cRepo.findById(id).orElse(null);
    }
}
