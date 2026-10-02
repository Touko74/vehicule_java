package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public abstract class VehiculeEntity implements Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    protected int id;

    @JsonProperty("nom")
    protected String nom;

    @JsonProperty("prix")
    protected float prix;

    @ManyToOne
    @JoinColumn(name = "concessionaire_id")
    protected Concessionnaire concessionnaire;

    protected VehiculeEntity() {}

    protected VehiculeEntity(String nom, float prix) {
        this.nom = nom;
        this.prix = prix;
    }

    @Override
    public boolean valeur() {
        return this.prix > 1000;
    }

    @Override
    public float getPrix() {
        return prix;
    }

    @Override
    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }
}