package com.biblio.repository;

import com.biblio.model.AdherantModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdherantRepository extends JpaRepository<AdherantModel, Long> {
    // Tu peux ajouter des méthodes personnalisées ici si besoin
}
