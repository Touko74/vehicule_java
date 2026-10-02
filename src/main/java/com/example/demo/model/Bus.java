package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    int id;
    @JsonProperty("nom")
    String nom;
    @JsonProperty("prix")
    float prix;

    public Bus(String nom, float prix ){
        this.nom=nom;
        this.prix=prix;
    }


    public boolean valeur() {

        return this.prix > 300;
    }

    public void afficher() {
        System.out.println("Bus: " + nom + " - " + prix + "€");
    }
}
