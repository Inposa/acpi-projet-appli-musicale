/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.iut.musidex.controller;

import java.util.ArrayList;
import fr.iut.musidex.entity.I_Morceau;
import fr.iut.musidex.entity.Morceau;

/**
 *
 * @author diazt
 */
public class ControllerCreation {
    
    
    public ArrayList<I_Morceau> getBibliotheque() {
        I_Morceau m1 = new Morceau();
        I_Morceau m2 = new Morceau();
        I_Morceau m3 = new Morceau();
        m1.setNom("René la Taupe");
        m2.setNom("Crazy Frog");
        m3.setNom("Générique de Pokémon Saison 1");
        ArrayList<I_Morceau> lesMorceaux = new ArrayList<I_Morceau>();
        lesMorceaux.add(m1);
        lesMorceaux.add(m2);
        lesMorceaux.add(m3);
        return lesMorceaux;
    }
    

}
