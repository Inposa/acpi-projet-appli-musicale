package fr.iut.musidex.entity;

public interface I_Morceau {
<<<<<<< HEAD
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
=======

    public String getNom();
    public void setNom(String nom);
    
    public String getInterprete();
    public void setInterprete(String interprete);
    
    public String getParoles();
    public void setParoles(String paroles);
    
    public String getPartition();
    public void setPartition(String partition);
    
    public Tonalite getTonaliteOriginale();
    public void setTonaliteOriginale(Tonalite tonalite);
    
    public Tonalite getTonaliteJouee();
    public void setTonaliteJouee(Tonalite tonalite);
    
    public float getDuree();
    public void setDuree(float duree);
    
    public String getLienYT();
    public void setLienYT(String lienYT);
    
    public String getImage();
    public void setImage(String imageURL);
    
    public String getCommentaire();
    public void setCommentaire(String commentaire);
    
	public int getId();
    
    
>>>>>>> edition-morceau
}
