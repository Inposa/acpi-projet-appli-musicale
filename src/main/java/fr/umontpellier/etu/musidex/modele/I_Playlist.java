package main.java.fr.umontpellier.etu.musidex.modele;

public interface I_Playlist {
    int getId();

    String getNom();
    void setNom(String nom);

    I_Morceau[] getMorceaux();
    void ajouterMorceau(I_Morceau morceau);
    void supprimerMorceau(I_Morceau morceau);
}
