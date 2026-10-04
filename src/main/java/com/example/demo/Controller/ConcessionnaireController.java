package com.example.demo.Controller;

import com.example.demo.model.Concessionnaire;
import com.example.demo.service.ConcessionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/concessionnaire")
public class ConcessionnaireController {

    private final ConcessionnaireService concessionnaireService;

    @Autowired
    public ConcessionnaireController(ConcessionnaireService concessionnaireService){
        this.concessionnaireService = concessionnaireService;
    }

    @PostMapping
    public Concessionnaire create(@RequestParam String marque, @RequestParam String respo){
        return concessionnaireService.create(marque, respo);
    }

    @GetMapping
    public String helloworld(){
        return "Hello concessionnaire";
    }
}