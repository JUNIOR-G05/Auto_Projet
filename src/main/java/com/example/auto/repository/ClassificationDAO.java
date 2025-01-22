package com.example.auto.repository;

import com.example.Auto.Models.Classification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassificationDAO extends JpaRepository<Classification, Long> {
}
