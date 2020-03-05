package fr.iut.musidex.modelview;

public class MorceauModelView {
    private String nom;
    private String interprete;
    private String tonalite;
    private String duree;
    private String lienYT;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }


    public String getTonalite() {
        return this.tonalite;
    }

    public void setTonalite(String tonalite) {
        this.tonalite = tonalite;

    }

    public String getDuree() {
        return this.duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }


    public String getLienYT() {
        return lienYT;
    }

    public void setLienYT(String lienYT) {
        this.lienYT = lienYT;
    }
}
