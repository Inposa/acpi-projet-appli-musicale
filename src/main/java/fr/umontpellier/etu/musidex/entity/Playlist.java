package fr.umontpellier.etu.musidex.entity;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements I_Playlist{

    private static int compteurId = 0;

    private int id;

    private String nom;

    private List<I_Partie> parties;

    public Playlist() { this.id = ++compteurId; }

    public Playlist(String nom) {
        this();
        this.nom = nom;
        parties = new ArrayList<>();
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
    public List<I_Partie> getParties() {
        return parties;
    }

    @Override
    public void ajouterPartie(I_Partie partie) {
        parties.add(partie);
    }

    @Override
    public void supprimerPartie(I_Partie partie) {
        parties.remove(partie);
    }

}
