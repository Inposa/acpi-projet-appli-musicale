package main.java.fr.iut.musidex.entity;

public class Morceau implements I_Morceau {
	private static int LAST_ID = 0;
	
	private int id;
	
	private String nom;
	private String interprete;
	private String paroles;
	private String partition;
	
	private Tonalite tonalite;
	
	private float duree;
	
	private String lienYT;
	
	public Morceau(int id, String nom, String interprete, String paroles, String partition, Tonalite tonalite, float duree, String lienYT) {
		this.id = id;
		this.nom = nom;
		this.interprete = interprete;
		this.paroles = paroles;
		this.partition = partition;		
		this.tonalite = tonalite;
		
		//Durée de 0 par défaut
		this.duree = duree;
		
		this.lienYT = lienYT;
	}
	
	public Morceau(String nom, String interprete, String paroles, String partition, Tonalite tonalite, float duree, String lienYT) {
		this(++LAST_ID, nom, interprete, paroles, partition, tonalite, duree, lienYT);
	}

	public Morceau(String nom, String interprete, String paroles, String partition, Tonalite tonalite, String lienYT) {
		this(nom, interprete, paroles, partition, tonalite, 0, lienYT);
	}
	public Morceau(String nom, String interprete, String paroles, String partition, String lienYT) {
		this(nom, interprete, paroles, partition, Tonalite.C, lienYT);
	}
	public Morceau(String nom, String interprete) {
		this(nom, interprete, "", "", "");
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
	public String getParoles() {
		return this.paroles;
	}
	@Override
	public void setParoles(String paroles) {
		this.paroles = paroles;
	}
	
	@Override
	public String getPartition() {
		return this.partition;
	}
	@Override
	public void setPartition(String partition) {
		this.partition = partition;
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
