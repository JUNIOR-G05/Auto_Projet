package com.example.auto.mapper;

import com.example.auto.dto.user.ResponseUtilisateur;
import com.example.auto.entity.user.Utilisateur;
import org.springframework.stereotype.Component;

@Component
public class ResponseMapper {
    public ResponseUtilisateur responseUtilisateur(Utilisateur utilisateur) {
        if (utilisateur == null) {
            return null;
        }

        return new ResponseUtilisateur(
                utilisateur.getId(),
                utilisateur.getNom(),
                utilisateur.getPrenom(),
                utilisateur.getNumero(),
                utilisateur.getEmail(),
                utilisateur.getUsername(),
                utilisateur.getRole().getLibelle().name(),
                utilisateur.getCreatedAt(),
                utilisateur.getActif());
    }
}
