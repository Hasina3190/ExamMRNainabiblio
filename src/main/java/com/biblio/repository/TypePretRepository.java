package com.biblio.repository;

import com.biblio.model.TypePretModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypePretRepository extends JpaRepository<TypePretModel, Long> {
    TypePretModel findByLibelle(String libelle);
}
