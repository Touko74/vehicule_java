package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Voiture  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    int id;
    @JsonProperty("nom")
    String  nom;
    @JsonProperty("prix")
    float prix;

    public Voiture(String nom, float prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public boolean valeur() {
        if (this.prix > 1000) {
            return true;
        }
        else{
            return false;
        }
    }

    public void afficher() {
        System.out.println("Voiture: " + nom + " - " + prix + "€");
    }


}
