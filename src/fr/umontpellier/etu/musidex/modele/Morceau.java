package fr.umontpellier.etu.musidex.modele;

public class Morceau implements I_Morceau {
	private static int LAST_ID = 0;
	
	private int id;
	
	private String nom;
	private String interprete;
	
	private Tonalite tonalite;
	
	private float duree;
	
	private String lienYT;
	
	public Morceau(int id, String nom, String interprete,Tonalite tonalite, float duree) {
		this.id = id;
		this.nom = nom;
		this.interprete = interprete;
		this.tonalite = tonalite;
		
		//Durée de 0 par défaut
		this.duree = duree;
		
		this.lienYT = null;
	}
	
	public Morceau(String nom, String interprete,Tonalite tonalite, float duree) {
		this(++LAST_ID, nom, interprete, tonalite, 0);
	}

	public Morceau(String nom, String interprete, Tonalite tonalite) {
		this(nom, interprete, tonalite, 0);
	}
	public Morceau(String nom, String interprete) {
		this(nom, interprete, Tonalite.C);
	}
	
	@Override
	public String getNom() {
		return this.nom;
	}
	@Override
	public void setNom(String nom) {
		this.nom = nom;		
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

	@Override
	public String getLienYT() {
		return lienYT;
	}
	@Override
	public void setLienYT(String lienYT) {
		this.lienYT = lienYT;
	}

	@Override
	public int getId() {
		return this.id;
	}

	/*@Override
	public String toString() {
		return "Morceau: " + this.nom + "| Interprète:" + this.interprete + "| Tonalité:" + this.tonalite;
	}*/

}
