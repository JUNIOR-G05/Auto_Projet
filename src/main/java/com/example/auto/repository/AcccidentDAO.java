package com.example.auto.repository;


import com.example.Auto.Models.Accident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcccidentDAO extends JpaRepository<Accident, Long> {
}
