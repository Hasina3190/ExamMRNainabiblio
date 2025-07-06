package com.biblio.repository;

import com.biblio.model.ExemplaireModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExemplaireRepository extends JpaRepository<ExemplaireModel, Long> {
    List<ExemplaireModel> findByLivreId(Long livreId); 
}
