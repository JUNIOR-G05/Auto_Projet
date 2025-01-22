package com.example.auto.repository.jwt;

import com.example.auto.entity.jwt.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RefreshTokenDAO extends JpaRepository<RefreshToken, UUID> {
}
