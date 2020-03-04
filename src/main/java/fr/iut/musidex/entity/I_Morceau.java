package fr.iut.musidex.entity;

public interface I_Morceau {
    int getId();
  
    public String getNom();
    public void setNom(String nom);
    
    public String getInterprete();
    public void setInterprete(String interprete);

    public Tonalite getTonalite();
    public void setTonalite(Tonalite tonalite);

    public float getDuree();
    public void setDuree(float duree);
    
    public String getLienYT();
    public void setLienYT(String lienYT);
}
