package main.java.fr.iut.musidex.entity;

import java.util.ArrayList;

import sun.security.util.Length;

public class Morceaux implements I_Morceaux {

	private ArrayList<I_Morceau> list_morceaux; 
	
	public Morceaux() {
		this.list_morceaux = new ArrayList<I_Morceau>();
	}
	
	@Override
	public ArrayList<I_Morceau> get_morceaux() {
		return this.list_morceaux;
	}

	@Override
	public void add_morceau(I_Morceau morceau) {
		this.list_morceaux.add(morceau);
	}

	@Override
	public boolean remove_morceau(int index) {
		if(index >= 0 && index < this.get_nombre_morceaux()) {
			this.list_morceaux.remove(index);
			return true;
		}
		return false;
	}

	@Override
	public boolean remove_morceau(I_Morceau morceau) {
		return this.list_morceaux.remove(morceau);
	}

	@Override
	public boolean pop_morceau() {
		if(this.list_morceaux.size() > 0) {
			this.list_morceaux.remove(this.get_nombre_morceaux()-1);
			return true;
		}
		return false;
	}

	@Override
	public void clean_morceaux() {
		this.list_morceaux.clear();
	}

	@Override
	public int get_nombre_morceaux() {
		return this.list_morceaux.size();
	}

	@Override
	public I_Morceau get_morceau(int index) {
		if(index >= 0 && index < this.get_nombre_morceaux())
			return this.list_morceaux.get(index);
		return null;
	}

}
