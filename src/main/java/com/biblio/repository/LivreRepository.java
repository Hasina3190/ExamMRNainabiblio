package com.biblio.repository;

import com.biblio.model.LivreModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreRepository extends JpaRepository<LivreModel, Long> {
    // Tu peux ajouter des méthodes comme : findByTitre, findByLangue, etc.
}
