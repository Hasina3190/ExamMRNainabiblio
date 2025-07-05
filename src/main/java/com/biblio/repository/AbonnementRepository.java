package com.biblio.repository;

import com.biblio.model.AbonnementModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AbonnementRepository extends JpaRepository<AbonnementModel, Long> {
    
    // Trouver les abonnements d’un adhérant
    List<AbonnementModel> findByAdherantId(Long adherantId);
    
    // Vérifier s’il existe un chevauchement
    boolean existsByAdherantIdAndDateFinAfterAndDateDebutBefore(Long adherantId, 
                                                                java.time.LocalDate dateDebut, 
                                                                java.time.LocalDate dateFin);
}
