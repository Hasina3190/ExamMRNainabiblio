package com.biblio.repository;

import com.biblio.model.TypeAdherantModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeAdherantRepository extends JpaRepository<TypeAdherantModel, Integer> {
    // Exemple : rechercher par libellé
    TypeAdherantModel findByLibelle(String libelle);
}
