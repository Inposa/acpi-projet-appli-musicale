package fr.umontpellier.etu.musidex.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fr.umontpellier.etu.musidex.modele.Morceau;
import fr.umontpellier.etu.musidex.modele.Morceaux;

class TestMorceaux {

	@Test
	void test_creation_morceaux_vide() {
		Morceaux morceaux = new Morceaux();
		
		assertTrue(true);
	}
	
	@Test
	void test_ajout_morceau() {
		Morceaux morceaux = new Morceaux();
		
		Morceau morceau = new Morceau("Reptile","Periphery");
		
		morceaux.add_morceau(morceau);
		
		assertTrue(morceaux.get_nombre_morceaux() == 1);
		assertTrue(morceaux.get_morceau(0) == morceau);
	}

	@Test 
	void test_supprimer_morceau_avec_index_valide(){
		Morceaux morceaux = new Morceaux();
		
		morceaux.add_morceau(new Morceau("Fear","Unprocessed"));
		morceaux.add_morceau(new Morceau("Reptile","Periphery"));
		morceaux.add_morceau(new Morceau("G.O.A.T","Polyphia"));

		
		
		assertTrue(morceaux.remove_morceau(1));	
	}

	@Test 
	void test_supprimer_morceau_avec_index_invalide(){
		Morceaux morceaux = new Morceaux();
		
		morceaux.add_morceau(new Morceau("Fear","Unprocessed"));

		assertFalse(morceaux.remove_morceau(1));	
	}
	
	@Test
	void test_pop_morceau() {
		Morceaux morceaux = new Morceaux();

		morceaux.add_morceau(new Morceau("Reptile","Periphery"));

		morceaux.pop_morceau();
		assertTrue(morceaux.get_nombre_morceaux() == 0);
	}
	
	@Test	
	void test_pop_moeceau_avec_morceaux_vide() {
		Morceaux morceaux = new Morceaux();
		
		try {
			morceaux.pop_morceau();
			assertTrue(true);
		}
		catch (Exception e) {
			assertTrue(false);
		}
	}
	
	@Test
	void test_obtenir_morceau_avec_index_valide() {
		Morceaux morceaux = new Morceaux();
		
		Morceau morceau_to_insert = new Morceau("Reptile","Periphery");
		Morceau morceau_to_compare = new Morceau("Fear","Unprocessed");

		morceaux.add_morceau(morceau_to_insert);
		
		assertTrue(morceaux.get_morceau(0) == morceau_to_insert);
		assertTrue(morceaux.get_morceau(0) != morceau_to_compare);		
	}	

}
