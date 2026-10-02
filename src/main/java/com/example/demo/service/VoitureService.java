package com.example.demo.service;

import com.example.demo.model.Voiture;
import com.example.demo.repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoitureService {

    private final VoitureRepository voitureRepository;

    @Autowired
    public VoitureService(VoitureRepository voitureRepository){
        this.voitureRepository = voitureRepository;
    }

    public Voiture create(String nom, float prix){
        Voiture voiture = new Voiture(nom, prix);
        return voitureRepository.save(voiture);
    }
}
