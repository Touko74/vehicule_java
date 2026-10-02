package com.example.demo.Controller;

import com.example.demo.model.Bus;
import com.example.demo.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bus")
public class BusController {

    private final BusService busService;

    @Autowired
    public BusController(BusService busService){
        this.busService = busService;
    }

    @GetMapping
    public String helloworld(){
        return "Bus";
    }

    @PostMapping
    public Bus create(@RequestParam String nom, @RequestParam float prix){
        return busService.create(nom,prix);
    }




}
