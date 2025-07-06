package com.biblio.repository;

import com.biblio.model.GestionPretModel;
import com.biblio.model.AdherantModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GestionPretRepository extends JpaRepository<GestionPretModel, Long> {
    GestionPretModel findByAdherant(AdherantModel adherant);
}
