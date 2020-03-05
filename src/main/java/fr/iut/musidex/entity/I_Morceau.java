package fr.iut.musidex.entity;

public interface I_Morceau {
    int getId();
    String getNom();
    void setNom(String nom);
    String getInterprete();
    void setInterprete(String interprete);
    Tonalite getTonalite();
    void setTonalite(Tonalite tonalite);
    float getDuree();
    void setDuree(float duree);
    String getLienYT();
    void setLienYT(String lienYT);
}
