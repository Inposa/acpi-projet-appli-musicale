package fr.iut.musidex.modele;

public class Morceau implements I_Morceau {
	private String titre;
	private String interprete;
	
	private String tonalite;
	
	public Morceau(String titre, String interprete) {
		
	}
	
	@Override
	public String getNom() {
		return this.titre;
	}

	@Override
	public void setNom(String nom) {
		this.titre = nom;		
	}
	

	@Override
	public String getInterprete() {
		return interprete;
	}

	@Override
	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}

	
	
	
	
}
