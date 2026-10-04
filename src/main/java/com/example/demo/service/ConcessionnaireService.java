package com.example.demo.service;

import com.example.demo.model.Concessionnaire;
import com.example.demo.repository.ConcessionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcessionnaireService {

    private final ConcessionnaireRepository concessionnaireRepository;

    @Autowired
    public ConcessionnaireService(ConcessionnaireRepository concessionnaireRepository){
        this.concessionnaireRepository = concessionnaireRepository;
    }

    public Concessionnaire create(String marque, String respo){
        Concessionnaire concessionnaire = new Concessionnaire(marque, respo);
        return concessionnaireRepository.save(concessionnaire);
    }
}