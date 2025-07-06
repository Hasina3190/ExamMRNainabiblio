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

    public List<ExemplaireModel> getAll() {
        return exemplaireRepository.findAll();
    }

    public List<ExemplaireModel> getByLivreId(Long livreId) {
        return exemplaireRepository.findByLivreId(livreId);
    }

    public ExemplaireModel save(ExemplaireModel exemplaire) {
        return exemplaireRepository.save(exemplaire);
    }

    public void delete(Long id) {
        exemplaireRepository.deleteById(id);
    }
}
