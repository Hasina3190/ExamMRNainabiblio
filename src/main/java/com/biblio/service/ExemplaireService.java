package com.biblio.service;

import com.biblio.model.ExemplaireModel;
import com.biblio.repository.ExemplaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExemplaireService {

    @Autowired
    private ExemplaireRepository exemplaireRepository;

    public List<ExemplaireModel> findAll() {
        return exemplaireRepository.findAll();
    }

    public List<ExemplaireModel> findByLivreId(Long livreId) {
        return exemplaireRepository.findByLivreId(livreId);
    }

    public ExemplaireModel findByExemplaireId(Long exemplaireId) {
        return exemplaireRepository.findById(exemplaireId).orElse(null);
    }

    public ExemplaireModel save(ExemplaireModel exemplaire) {
        return exemplaireRepository.save(exemplaire);
    }

    public void delete(Long id) {
        exemplaireRepository.deleteById(id);
    }
}
