package com.example.demo.Controller;

import com.example.demo.model.Velo;
import com.example.demo.service.VeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/velo")
public class VeloController {

    private final VeloService veloService;

    @Autowired
    public VeloController(VeloService veloService){
        this.veloService = veloService;
    }

    @GetMapping
    public String helloworld(){
        return "velo tout terrain";
    }

    @PostMapping
    public Velo create(@RequestParam String nom, @RequestParam float prix){
        return veloService.create(nom,prix);
    }




}
