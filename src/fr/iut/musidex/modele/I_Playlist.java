package fr.iut.musidex.modele;

import java.util.List;

public interface I_Playlist {
    int getId();

    String getNom();
    void setNom(String nom);

    List<I_Morceau> getMorceaux();
    void ajouterMorceau(I_Morceau morceau);
    void supprimerMorceau(I_Morceau morceau);
}
