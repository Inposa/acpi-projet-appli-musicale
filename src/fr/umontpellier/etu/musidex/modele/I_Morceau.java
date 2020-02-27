package fr.umontpellier.etu.musidex.modele;

public interface I_Morceau {
    public String getNom();
    public void setNom(String nom);
    
    public String getInterprete();
    public void setInterprete(String interprete);
    
    public Tonalite getTonalite();
    public void setTonalite(Tonalite tonalite);    
    
    public float getDuree();
    public void setDuree(float duree);
	public int getId();
    
    
}
