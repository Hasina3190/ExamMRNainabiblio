package com.biblio.service;

import com.biblio.model.PretModel;
import com.biblio.repository.PretRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PretService {

    @Autowired
    private PretRepository pretRepository;

    public List<PretModel> getAll() {
        return pretRepository.findAll();
    }

    public PretModel save(PretModel pret) {
        return pretRepository.save(pret);
    }

    public PretModel getById(Long id) {
        return pretRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        pretRepository.deleteById(id);
    }

    public List<PretModel> getPretsParAdherant(Long adherantId) {
        return pretRepository.findByAdherantId(adherantId);
    }

    public boolean exemplaireDejaEmprunte(Long exemplaireId) {
        return !pretRepository.findByExemplaireIdAndDateEffectiveRetourIsNull(exemplaireId).isEmpty();
    }
}