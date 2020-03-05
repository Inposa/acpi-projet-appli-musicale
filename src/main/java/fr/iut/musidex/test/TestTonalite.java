package fr.iut.musidex.test;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import fr.iut.musidex.entity.Tonalite;


class TestTonalite {

	@Test
	void test() {
		Tonalite tona = Tonalite.valueOf("A");
		
		
		assertTrue(tona == Tonalite.A);	
	}
	

}
