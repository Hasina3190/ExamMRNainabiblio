package com.biblio.service;

import com.biblio.model.PenaliterModel;
import com.biblio.repository.PenaliterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PenaliterService {

    @Autowired
    private PenaliterRepository penaliterRepository;

    public List<PenaliterModel> getAll() {
        return penaliterRepository.findAll();
    }

    public List<PenaliterModel> getByAdherant(Long id) {
        return penaliterRepository.findByAdherantId(id);
    }

    public PenaliterModel save(PenaliterModel p) {
        return penaliterRepository.save(p);
    }

    public void delete(Long id) {
        penaliterRepository.deleteById(id);
    }
}
