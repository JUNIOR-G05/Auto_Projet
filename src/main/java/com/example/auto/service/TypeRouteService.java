package com.example.auto.service;

import com.example.auto.Interface.TypeRouteInter;
import com.example.auto.entity.TypeRoute;
import com.example.auto.repository.TypeRouteDAO;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeRouteService  implements TypeRouteInter {


    private final TypeRouteDAO trRepo;

    public TypeRouteService(TypeRouteDAO trRepo) {
        this.trRepo = trRepo;
    }

    @Override
    public List<TypeRoute> findAll() {
        return trRepo.findAll();
    }

    public TypeRoute save(TypeRoute typeRoute) {
        return trRepo.save(typeRoute);
    }

    public TypeRoute update(Long id, TypeRoute typeRoute) {
        return trRepo.save(typeRoute);
    }

    public Boolean delete(Long id) {
        trRepo.deleteById(id);return true;
    }

    public TypeRoute getByIdTypeRou(Long id) {
        return trRepo.getReferenceById(id);
    }
}
