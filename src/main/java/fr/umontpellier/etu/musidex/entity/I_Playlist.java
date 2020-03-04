package fr.umontpellier.etu.musidex.entity;

import java.util.List;

public interface I_Playlist {
    int getId();

    String getNom();
    void setNom(String nom);

    void ajouterPartie(I_Partie partie);
    void supprimerPartie(I_Partie partie);

    List<I_Partie> getParties();
}
