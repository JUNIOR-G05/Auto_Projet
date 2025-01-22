package com.example.auto.repository;

import com.example.auto.entity.user.Role;
import com.example.auto.enumpack.TypeDeRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RoleDAO extends JpaRepository<Role, Long> {
    Role findById(UUID id);

    Role findByLibelle(TypeDeRole libelle);
}
