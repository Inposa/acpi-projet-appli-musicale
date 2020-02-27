package fr.iut.musidex.entity;

public class Morceau implements I_Morceau {
	private String titre;
	private String interprete;
	
	private String tonalite;
	
	public Morceau(String titre, String interprete) {
		
		
	}


	@Override
	public String getNom() {
		return titre;
	}

	@Override
	public void setNom(String nom) {
		titre = nom;
	}
}
