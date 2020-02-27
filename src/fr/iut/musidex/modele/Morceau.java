package fr.iut.musidex.modele;

public class Morceau implements I_Morceau {
	private String titre;
	private String interprete;
	
	private Tonalite tonalite;
	
	private float duree;
	
	public Morceau(String titre, String interprete,Tonalite tonalite, float duree) {
		this.titre = titre;
		this.interprete = interprete;
		this.tonalite = tonalite;
		
		//Durée de 0 par défaut
		this.duree = duree;
	}
	
	public Morceau(String titre, String interprete, Tonalite tonalite) {
		this(titre, interprete, tonalite, 0);
	}
	
	public Morceau(String titre, String interprete) {
		this(titre, interprete, Tonalite.C);
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
	
	public String toString() {
		return "Morceau: " + this.titre + "| Interprète:" + this.interprete + "| Tonalité:" + this.tonalite;
	}

	@Override
	public float getDuree() {
		return this.duree;
	}

	@Override
	public void setDuree(float duree) {
		this.duree = duree;
		
	}


}
