package com.example.auto.Interface;

import com.example.auto.entity.Classification;

import java.util.List;

public interface ClassificationInter {

    List<Classification> findAll();

    Classification save(Classification classification);

    Classification update(Long id, Classification classification);

    Boolean delete(Long id);

    public Classification getByIdClass(Long id) ;
}
