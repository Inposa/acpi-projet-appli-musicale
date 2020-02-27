package fr.umontpellier.etu.musidex.modele;

public class Morceau implements I_Morceau {
	private static int LAST_ID = 0;
	
	private int id;
	
	private String titre;
	private String interprete;
	
	private Tonalite tonalite;
	
	private float duree;
	
	private String lienYT;
	
	public Morceau(int id, String titre, String interprete,Tonalite tonalite, float duree) {
		this.id = id;
		this.titre = titre;
		this.interprete = interprete;
		this.tonalite = tonalite;
		
		//Durée de 0 par défaut
		this.duree = duree;
		
		this.lienYT = null;
	}
	
	public Morceau(String titre, String interprete,Tonalite tonalite, float duree) {
		this(++LAST_ID, titre, interprete, tonalite, 0);
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

	@Override
	public float getDuree() {
		return this.duree;
	}
	@Override
	public void setDuree(float duree) {
		this.duree = duree;
	}

	public String getLienYT() {
		return lienYT;
	}
	public void setLienYT(String lienYT) {
		this.lienYT = lienYT;
	}

	@Override
	public int getId() {
		return this.id;
	}

	/*@Override
	public String toString() {
		return "Morceau: " + this.titre + "| Interprète:" + this.interprete + "| Tonalité:" + this.tonalite;
	}*/


}
