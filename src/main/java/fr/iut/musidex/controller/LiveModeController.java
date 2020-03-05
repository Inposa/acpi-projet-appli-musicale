package fr.iut.musidex.controller;

import fr.iut.musidex.entity.Morceau;
import fr.iut.musidex.entity.Playlist;
import fr.iut.musidex.entity.Tonalite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LiveModeController {
    public static Map<Integer, String> getBasicMorceauInfoFromPlaylist (int playlistID) {
        Map<Integer, String> infoMorceau = new HashMap<>();
        Playlist p = new Playlist();
        List<Morceau> morceaux = new ArrayList<>();
        morceaux.add(new Morceau("Dragovic", "Maes", Tonalite.C, 2.51f));
        morceaux.add(new Morceau("Papaya", "Yiuliusly", Tonalite.E, 3.37f));
        morceaux.forEach(i_morceau -> infoMorceau.put(i_morceau.getId(),
                i_morceau.getNom() + " - " +
                        i_morceau.getInterprete() + " - " + i_morceau.getDuree()));
        return infoMorceau;
    }

}
