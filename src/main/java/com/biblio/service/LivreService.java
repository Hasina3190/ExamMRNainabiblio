package com.biblio.service;

import com.biblio.model.LivreModel;
import com.biblio.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivreService {

    @Autowired
    private LivreRepository livreRepository;

    public List<LivreModel> getAll() {
        return livreRepository.findAll();
    }

    public LivreModel getById(Long id) {
        return livreRepository.findById(id).orElse(null);
    }

    public LivreModel save(LivreModel livre) {
        return livreRepository.save(livre);
    }

    public void delete(Long id) {
        livreRepository.deleteById(id);
    }
}
