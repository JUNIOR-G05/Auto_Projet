package com.example.auto.dto.user;

import com.example.auto.entity.user.Role;
import com.example.auto.enumpack.TypeDeRole;

import java.time.Instant;
import java.util.UUID;

public record ResponseUtilisateur(
        UUID id,
        String nom,
        String prenom,
        Integer telephone,
        String email,
        String username,
        String role,
        Instant dateCreation,
        Boolean actif) {
}
