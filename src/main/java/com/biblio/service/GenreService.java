package com.biblio.service;

import com.biblio.model.GenreModel;
import com.biblio.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {

    @Autowired
    private GenreRepository genreRepository;

    public List<GenreModel> findAll() {
        return genreRepository.findAll();
    }

    public GenreModel findById(Long id) {
        return genreRepository.findById(id).orElse(null);
    }

    public GenreModel save(GenreModel genre) {
        return genreRepository.save(genre);
    }

    public void delete(Long id) {
        genreRepository.deleteById(id);
    }
}
