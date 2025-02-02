package com.example.auto.service;

import com.example.auto.dto.user.ResponseUtilisateur;
import com.example.auto.dto.user.SaveUtilisateurDTO;
import com.example.auto.dto.user.UpdateUtilisateurDTO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.UUID;

public interface UtilisateurService extends UserDetailsService {



    List<ResponseUtilisateur> findAll();

    ResponseUtilisateur findByEmail(String email);

    ResponseUtilisateur findByUsername(String username);

    ResponseUtilisateur save(SaveUtilisateurDTO utilisateur);

    ResponseUtilisateur update(UUID id, UpdateUtilisateurDTO utilisateur);

    void delete(UUID id);

    Boolean activateUser(UUID id);

    UserDetails loadUserByUsername(String username);
}
