package fr.iut.musidex.model;

public class PlaylistModel {
    String nom;
    int nbMorceaux;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public int getCount(){
        return nbMorceaux;
    }
    
    public void setNbMorceaux(int nb){
        nbMorceaux = nb;
    }
}