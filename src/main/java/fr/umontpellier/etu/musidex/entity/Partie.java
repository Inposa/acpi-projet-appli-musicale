package fr.umontpellier.etu.musidex.entity;

import java.util.ArrayList;
import java.util.List;

public class Partie implements I_Partie {
    private static int compteurId = 0;

    private int id;

    private String nom;

    private List<I_Morceau> morceaux;

    public Partie() { this.id = ++compteurId; }

    public Partie(String nom) {
        this();
        this.nom = nom;
        morceaux= new ArrayList<>();
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public List<I_Morceau> getMorceaux() {
        return morceaux;
    }

    @Override
    public void ajouterMorceau(I_Morceau morceau) {
        morceaux.add(morceau);
    }

    @Override
    public void supprimerMorceau(I_Morceau morceau) {
        morceaux.remove(morceau);
    }
}
