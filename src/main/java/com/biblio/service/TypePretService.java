package com.biblio.service;

import com.biblio.model.TypePretModel;
import com.biblio.repository.TypePretRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypePretService {

    @Autowired
    private TypePretRepository typePretRepository;

    public List<TypePretModel> getAll() {
        return typePretRepository.findAll();
    }

    public TypePretModel findByLibelle(String libelle) {
        return typePretRepository.findByLibelle(libelle);
    }

    public TypePretModel getById(Long id) {
        return typePretRepository.findById(id).orElse(null);
    }
}
