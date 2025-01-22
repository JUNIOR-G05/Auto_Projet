package com.example.auto.repository;

import com.example.auto.entity.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculeDAO extends JpaRepository<Vehicule, Long> {
}
