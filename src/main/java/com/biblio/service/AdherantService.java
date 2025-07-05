package com.biblio.service;

import com.biblio.model.AdherantModel;
import com.biblio.repository.AdherantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdherantService {

    @Autowired
    private AdherantRepository adherantRepository;

    public List<AdherantModel> getAll() {
        return adherantRepository.findAll();
    }

    public AdherantModel getById(Long id) {
        return adherantRepository.findById(id).orElse(null);
    }

    public AdherantModel save(AdherantModel adherant) {
        return adherantRepository.save(adherant);
    }

    public void delete(Long id) {
        adherantRepository.deleteById(id);
    }
}
