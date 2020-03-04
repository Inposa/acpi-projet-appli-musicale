package fr.umontpellier.etu.musidex.entity;

import java.util.List;

public interface I_Partie {
    int getId();

    String getNom();
    void setNom(String nom);

    List<I_Morceau> getMorceaux();

    void ajouterMorceau(I_Morceau morceau);
    void supprimerMorceau(I_Morceau morceau);
}
