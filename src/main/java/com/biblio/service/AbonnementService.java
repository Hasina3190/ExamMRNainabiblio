package com.biblio.service;

import com.biblio.model.AbonnementModel;
import com.biblio.repository.AbonnementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbonnementService {

    @Autowired
    private AbonnementRepository abonnementRepository;

    public List<AbonnementModel> getByAdherantId(Long adherantId) {
        return abonnementRepository.findByAdherantId(adherantId);
    }

    public boolean aUnChevauchement(Long adherantId, java.time.LocalDate debut, java.time.LocalDate fin) {
        return abonnementRepository.existsByAdherantIdAndDateFinAfterAndDateDebutBefore(adherantId, debut, fin);
    }

    public AbonnementModel enregistrer(AbonnementModel abonnement) {
        return abonnementRepository.save(abonnement);
    }
}
