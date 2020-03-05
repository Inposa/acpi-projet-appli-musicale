package fr.iut.musidex.modelview;

public class PlaylistModelView {
    private String nom;
    private int nbMorceaux;
    private int id;

    public int getNbMorceaux() {
        return nbMorceaux;
    }

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

    public void setNbMorceaux(int nb){
        nbMorceaux = nb;
    }
}
