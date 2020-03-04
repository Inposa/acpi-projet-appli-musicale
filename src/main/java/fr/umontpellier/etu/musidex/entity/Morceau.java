package fr.umontpellier.etu.musidex.entity;

import java.util.ArrayList;

public class Morceau implements I_Morceau {

    private static int compteurId = 0;

    private int id;

    String nom;

    public Morceau() { this.id = ++compteurId; }

    public Morceau(String nom) {
        this();
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom;
    }

    @Override
    public int getId() {
        return id;
    }
}
