package com.example.auto.repository;

import com.example.auto.entity.Signalisation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignalisationDAO extends JpaRepository<Signalisation, Long> {
}
