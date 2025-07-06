package com.biblio.repository;

import com.biblio.model.PretModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PretRepository extends JpaRepository<PretModel, Long> {
    List<PretModel> findByAdherantId(Long adherantId);
    List<PretModel> findByExemplaireIdAndDateEffectiveRetourIsNull(Long exemplaireId);
}
