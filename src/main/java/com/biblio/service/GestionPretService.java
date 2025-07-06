package com.biblio.service;

import com.biblio.model.AdherantModel;
import com.biblio.model.GestionPretModel;
import com.biblio.repository.GestionPretRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GestionPretService {

    @Autowired
    private GestionPretRepository gestionPretRepository;

    public GestionPretModel getByAdherant(AdherantModel adherant) {
        return gestionPretRepository.findByAdherant(adherant);
    }

    public void save(GestionPretModel gestion) {
        gestionPretRepository.save(gestion);
    }
}
