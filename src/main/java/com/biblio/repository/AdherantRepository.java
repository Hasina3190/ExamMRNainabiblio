package com.biblio.repository;

import com.biblio.model.AdherantModel;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdherantRepository extends JpaRepository<AdherantModel, Long> {
    // Tu peux ajouter des méthodes personnalisées ici si besoin
    Optional<AdherantModel> findById(Long adherantId); 
    AdherantModel findByEmailAndMotDePasse(String email, String password);
}
