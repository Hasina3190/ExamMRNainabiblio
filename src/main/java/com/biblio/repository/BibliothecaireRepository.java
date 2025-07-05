package com.biblio.repository;

import com.biblio.model.BibliothecaireModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliothecaireRepository extends JpaRepository<BibliothecaireModel, Long> {
    // Pour plus tard : trouver par email pour l'authentification
    BibliothecaireModel findByEmail(String email);
}
