package com.example.auto.repository;

import com.example.auto.entity.Classification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassificationDAO extends JpaRepository<Classification, Long> {
}
