package com.example.auto.repository;

import com.example.Auto.Models.Assurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssuranceDAO extends JpaRepository<Assurance, Long> {
}
