package com.example.auto.repository;

import com.example.Auto.Models.Signalisation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignalisationDAO extends JpaRepository<Signalisation, Long> {
}
