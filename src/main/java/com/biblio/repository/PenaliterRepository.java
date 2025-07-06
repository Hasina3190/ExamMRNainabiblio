package com.biblio.repository;

import com.biblio.model.PenaliterModel;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PenaliterRepository extends JpaRepository<PenaliterModel, Long> {
    List<PenaliterModel> findByAdherantId(Long adherantId);
}
