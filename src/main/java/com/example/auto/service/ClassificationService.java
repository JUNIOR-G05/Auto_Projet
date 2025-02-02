package com.example.auto.service;


import com.example.auto.Interface.ClassificationInter;
import com.example.auto.entity.Classification;
import com.example.auto.repository.ClassificationDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ClassificationService implements ClassificationInter {

    private ClassificationDAO cRepo;

    public ClassificationService(ClassificationDAO cRepo) {
        this.cRepo = cRepo;
    }

    @Override
    public List<Classification> findAll() {
        return null;
    }

    public Classification save(Classification classification) {
        return cRepo.save(classification);
    }
    public List<Classification> getClassifications() {
        return cRepo.findAll();
    }
    public Classification update(Long id, Classification classification ) {
        return null;
    }

    public Boolean delete(Long id) {
        return null;
    }

    public Classification getByIdClass(Long id) {
        return this.cRepo.findById(id).orElse(null);
    }
}
