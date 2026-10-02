package com.example.demo.Controller;

import com.example.demo.model.Voiture;
import com.example.demo.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/voiture")
public class VoitureController {

    private final VoitureService voitureService;

    @Autowired
    public VoitureController(VoitureService voitureService){
        this.voitureService = voitureService;
    }

    @GetMapping
    public String helloworld(){
       return "Hell0 world";
    }

    @PostMapping
    public Voiture create(@RequestParam String nom, @RequestParam float prix){
        return voitureService.create(nom,prix);
    }


}
