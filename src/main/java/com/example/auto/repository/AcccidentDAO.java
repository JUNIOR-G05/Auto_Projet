package com.example.auto.repository;



import com.example.auto.entity.Accident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcccidentDAO extends JpaRepository<Accident, Long> {
}
