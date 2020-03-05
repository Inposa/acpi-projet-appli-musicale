package fr.iut.musidex.entity;

public class Morceau implements I_Morceau {
	private static int LAST_ID = 0;
	
	private int id;
	
	private String nom;
	private String interprete;
	private String paroles;
	private String partition;
	
	private Tonalite tonaliteOriginale;
	private Tonalite tonaliteJouee;
	
	private float duree;
	
	private String lienYT;
	private String image;
	private String commentaire;
	
	public Morceau(int id, String nom, String interprete, String paroles, String partition, Tonalite tonaliteO, Tonalite tonaliteJ, float duree, String lienYT, String image, String commentaire) {
		this.id = id;
		
		this.nom = nom;
		this.interprete = interprete;
		this.paroles = paroles;
		this.partition = partition;		
		
		//tonalités C par défaut
		this.tonaliteOriginale = tonaliteO;
		this.tonaliteJouee = tonaliteJ;
		
		//Durée de 0 par défaut
		this.duree = duree;
		
		this.lienYT = lienYT;
		this.image = image;
		this.commentaire = commentaire;
	}
	
	public Morceau(String nom, String interprete, String paroles, String partition, Tonalite tonaliteO, Tonalite tonaliteJ, float duree, String lienYT, String image, String commentaire) {
		//nom, interprete, paroles, partition, tonaliteO, tonaliteJ, duree, lien, image
		this(++LAST_ID, nom, interprete, paroles, partition, tonaliteO, tonaliteJ, duree, lienYT, image, "");
	}
	public Morceau(String nom, String interprete, String paroles, String partition, Tonalite tonaliteO, Tonalite tonaliteJ, String lienYT) {
		//nom, interprete, paroles, partition, tonaliteO, tonaliteJ, duree, lien, image
		this(nom, interprete, paroles, partition, tonaliteO, tonaliteJ, 0, lienYT, "", "");
	}
	public Morceau(String nom, String interprete, String paroles, String partition, Tonalite tonalite, String lienYT) {
		//nom, interprete, paroles, partition, tonaliteO, tonaliteJ, duree, lien, image
		this(nom, interprete, paroles, partition, tonalite, tonalite, 0, lienYT, "", "");
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
	
	@Override
	public Tonalite getTonaliteOriginale() {
		return this.tonaliteOriginale;
	}
	@Override
	public void setTonaliteOriginale(Tonalite tonalite) {
		this.tonaliteOriginale = tonalite;
	}

	@Override
	public Tonalite getTonaliteJouee() {
		return this.tonaliteJouee;
	}

	@Override
	public void setTonaliteJouee(Tonalite tonalite) {
		this.tonaliteJouee = tonalite;
	}

	@Override
	public String getImage() {
		return this.image;
	}

	@Override
	public void setImage(String imageURL) {
		this.image = imageURL;
	}

	@Override
	public String getCommentaire() {
		return this.commentaire;
	}

	@Override
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
		
	}

	/*@Override
	public String toString() {
		return "Morceau: " + this.nom + "| Interprète:" + this.interprete + "| Tonalité:" + this.tonalite;
	}*/

}
