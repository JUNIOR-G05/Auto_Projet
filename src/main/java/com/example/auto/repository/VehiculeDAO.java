package com.example.auto.repository;

import com.example.Auto.Models.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculeDAO extends JpaRepository<Vehicule, Long> {
}
