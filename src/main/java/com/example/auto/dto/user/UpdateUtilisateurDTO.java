package com.example.auto.dto.user;

import java.util.UUID;

public record UpdateUtilisateurDTO(
                UUID id,
                String nom,
                String prenom,
                String email,
                Integer numero

) {
}
