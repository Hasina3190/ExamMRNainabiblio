package com.biblio.service;

import com.biblio.model.TypeAdherantModel;
import com.biblio.repository.TypeAdherantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeAdherantService {

    @Autowired
    private TypeAdherantRepository typeAdherantRepository;

    public List<TypeAdherantModel> getAll() {
        return typeAdherantRepository.findAll();
    }

    public TypeAdherantModel getById(Integer id) {
        return typeAdherantRepository.findById(id).orElse(null);
    }

    public TypeAdherantModel getByLibelle(String libelle) {
        return typeAdherantRepository.findByLibelle(libelle);
    }

    public TypeAdherantModel save(TypeAdherantModel type) {
        return typeAdherantRepository.save(type);
    }

    public void delete(Integer id) {
        typeAdherantRepository.deleteById(id);
    }
}
