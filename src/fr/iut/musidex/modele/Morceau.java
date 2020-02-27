package fr.iut.musidex.modele;

public class Morceau implements I_Morceau {
	private String titre;
	private String interprete;
	
	private Tonalite tonalite;
	
	public Morceau(String titre, String interprete,Tonalite tonalite) {
		this.titre = titre;
		this.interprete = interprete;
		
		this.tonalite = tonalite;
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

	@Override
	public Tonalite getTonalite() {
		return this.tonalite;
	}

	@Override
	public void setTonalite(Tonalite tonalite) {
		this.tonalite = tonalite;
		
	}

}
