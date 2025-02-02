package com.example.auto.service;

import com.example.auto.dto.user.ResponseUtilisateur;
import com.example.auto.dto.user.SaveUtilisateurDTO;
import com.example.auto.dto.user.UpdateUtilisateurDTO;
import com.example.auto.entity.user.Utilisateur;
import com.example.auto.mapper.ResponseMapper;
import com.example.auto.repository.UtilisateurDAO;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UtilisateurImpl implements UtilisateurService{

    UtilisateurDAO utilisateurDAO;
    ResponseMapper responseMapper;
    BCryptPasswordEncoder passwordEncoder;


    @Override
    public List<ResponseUtilisateur> findAll() {
       List<Utilisateur> utilisateurs = utilisateurDAO.findAll();
        return utilisateurs.stream().map(responseMapper::responseUtilisateur).collect(Collectors.toList());
    }

    @Override
    public ResponseUtilisateur findByEmail(String email) {
        Optional<Utilisateur> utilisateur = utilisateurDAO.findByEmail(email);
        return utilisateur.map(value -> responseMapper.responseUtilisateur(value)).orElse(null);
    }

    @Override
    public ResponseUtilisateur findByUsername(String username) {
        Optional<Utilisateur> utilisateur = utilisateurDAO.findByUsername(username);
        return utilisateur.map(value -> responseMapper.responseUtilisateur(value)).orElse(null);
    }

    @Override
    public ResponseUtilisateur save(SaveUtilisateurDTO utilisateur) {
       Utilisateur utilisateur1 = Utilisateur.builder()
               .email(utilisateur.email())
               .username(utilisateur.username())
               .mdp(passwordEncoder.encode(utilisateur.password()))
               .actif(true)
               .build();
        Utilisateur utilisateur2 = utilisateurDAO.save(utilisateur1);
        return responseMapper.responseUtilisateur(utilisateur2);
    }

    @Override
    public ResponseUtilisateur update(UUID id, UpdateUtilisateurDTO utilisateur) {
        return null;
    }

    @Override
    public void delete(UUID id) {
        try {
            utilisateurDAO.deleteById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public Boolean activateUser(UUID id) {
        Utilisateur utilisateur = utilisateurDAO.findById(id).orElse(null);
        if (utilisateur != null) {
            utilisateur.setActif(true);
            utilisateurDAO.save(utilisateur);
            return true;
        }
        return false;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        return utilisateurDAO.findByUsername(username).orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));
    }
}
