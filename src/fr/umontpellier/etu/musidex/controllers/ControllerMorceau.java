package fr.umontpellier.etu.musidex.controllers;
import java.sql.SQLException;

import fr.umontpellier.etu.musidex.DAO.MorceauDAO;
import fr.umontpellier.etu.musidex.modele.*;
import fr.umontpellier.etu.musidex.views.fenetreMorceaux;

public class ControllerMorceau{
	private Morceau m;
	private MorceauDAO mDAO;
	
	public Morceau getM() {
		return m;
	}

	public void setM(Morceau m) {
		this.m = m;
	}

	public ControllerMorceau(Morceau m) {
		this.m = m;
		this.mDAO = MorceauDAO.getInstance();
	}
	
	public void editerTonalite(String newTonalite) {
		Tonalite ton = Tonalite.valueOf(newTonalite);
		this.m.setTonalite(ton);
	}
	
	public void editerLienYoutube(String newLien) {
		this.m.setLienYT(newLien);
	}
	
	public void editerNom(String newNom) {
		this.m.setNom(newNom);
	}
	
	public void modifierMorceau(Morceau m) {
		try {
			mDAO.modifierMorceau(m);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void enregistrerMorceau(Morceau m) {
		try {
			mDAO.insererMorceau(m);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
