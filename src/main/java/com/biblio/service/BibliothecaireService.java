package com.biblio.service;

import com.biblio.model.BibliothecaireModel;
import com.biblio.repository.BibliothecaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliothecaireService {

    @Autowired
    private BibliothecaireRepository bibliothecaireRepository;

    public List<BibliothecaireModel> getAll() {
        return bibliothecaireRepository.findAll();
    }

    public BibliothecaireModel getById(Long id) {
        return bibliothecaireRepository.findById(id).orElse(null);
    }

    public BibliothecaireModel getByEmail(String email) {
        return bibliothecaireRepository.findByEmail(email);
    }

    public BibliothecaireModel save(BibliothecaireModel bibliothecaire) {
        return bibliothecaireRepository.save(bibliothecaire);
    }

    public void delete(Long id) {
        bibliothecaireRepository.deleteById(id);
    }

    public BibliothecaireModel findByEmailAndMotDePasse(String email, String motDePasse) {
        return bibliothecaireRepository.findByEmailAndMotDePasse(email, motDePasse);
    }

}
