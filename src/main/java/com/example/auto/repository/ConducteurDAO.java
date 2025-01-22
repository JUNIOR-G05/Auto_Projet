package com.example.auto.repository;

import com.example.auto.entity.Conducteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConducteurDAO extends JpaRepository<Conducteur, Long> {
}
