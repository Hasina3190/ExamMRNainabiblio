package com.biblio.service;

import com.biblio.model.AdherantModel;
import com.biblio.repository.AdherantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdherantService {

    @Autowired
    private AdherantRepository adherantRepository;

    public List<AdherantModel> findAllAdherant() {
        return adherantRepository.findAll();
    }

    public AdherantModel findAdherantById(Long id) {
        return adherantRepository.findById(id).orElse(null);
    }

    public AdherantModel saveAdherant(AdherantModel adherant) {
        return adherantRepository.save(adherant);
    }

    public void deleteAdherant(Long id) {
        adherantRepository.deleteById(id);
    }

    public Optional<AdherantModel> findById(Long adherantId){
        return adherantRepository.findById(adherantId);
    }

    public AdherantModel findByEmailAndMotDePasse(String email, String motDePasse) {
        return adherantRepository.findByEmailAndMotDePasse(email, motDePasse);
    }

}
