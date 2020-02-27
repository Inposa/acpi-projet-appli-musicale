package fr.iut.musidex.entity;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements I_Playlist{

    private static int compteurId = 0;

    private int id;

    private String nom;

    private List<I_Morceau> morceaux;

    public Playlist(String nom) {
        this.id = ++compteurId;
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
    public I_Morceau[] getMorceaux() {
        return morceaux.toArray(I_Morceau[]::new);
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
