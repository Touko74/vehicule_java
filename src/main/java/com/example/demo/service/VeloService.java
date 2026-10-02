package com.example.demo.service;

import com.example.demo.model.Velo;
import com.example.demo.model.Voiture;
import com.example.demo.repository.VeloRepository;
import com.example.demo.repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeloService {

    private final VeloRepository veloRepository;

    @Autowired
    public VeloService(VeloRepository veloRepository){
        this.veloRepository = veloRepository;
    }

    public Velo create(String nom, float prix){
        Velo velo = new Velo(nom, prix);
        return veloRepository.save(velo);
    }
}
