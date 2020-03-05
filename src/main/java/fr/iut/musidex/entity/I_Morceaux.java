package main.java.fr.iut.musidex.entity;

import java.util.ArrayList;

import main.java.fr.iut.musidex.entity.I_Morceau;

public interface I_Morceaux {

	public ArrayList<I_Morceau> get_morceaux();
	
	public void add_morceau(I_Morceau morceau);
	
	public boolean remove_morceau(int index);
	
	public boolean remove_morceau(I_Morceau morceau);
	
	public boolean pop_morceau();
	
	public void clean_morceaux();
	
	public int get_nombre_morceaux();
	
	public I_Morceau get_morceau(int index );
	
}
