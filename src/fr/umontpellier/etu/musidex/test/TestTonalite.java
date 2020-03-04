package fr.umontpellier.etu.musidex.test;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import fr.umontpellier.etu.musidex.modele.Tonalite;


class TestTonalite {

	@Test
	void test() {
		Tonalite tona = Tonalite.valueOf("A");
		
		
		assertTrue(tona == Tonalite.A);	
	}
	

}
