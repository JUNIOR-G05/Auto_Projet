package com.example.auto.repository;

import com.example.auto.entity.Hopital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HopitalDAO extends JpaRepository<Hopital, Long> {
}
