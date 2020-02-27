package fr.umontpellier.etu.musidex.model;

public class Morceau implements I_Morceau{

    String nom;

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

}
