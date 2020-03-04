package fr.iut.musidex.controller;

import fr.iut.musidex.entity.I_Morceau;
import fr.iut.musidex.entity.I_Playlist;
import fr.iut.musidex.entity.Morceau;
import fr.iut.musidex.entity.Playlist;
import fr.iut.musidex.modelview.ModelViewBuilder;
import fr.iut.musidex.modelview.MorceauModelView;
import fr.iut.musidex.modelview.PlaylistModelView;

import java.util.ArrayList;
import java.util.List;

public class HomeController {

    public List<MorceauModelView> getMorceaux(){
        List<I_Morceau> morceaux = new ArrayList<>();

        morceaux.add(new Morceau("morceau 1", "Inter 1"));
        morceaux.add(new Morceau("morceau 2", "Inter 2"));
        morceaux.add(new Morceau("morceau 3", "Inter 3"));

        List<MorceauModelView> models = new ArrayList<>();

        for (I_Morceau m : morceaux) {
            models.add(ModelViewBuilder.morceauToMorceauModel(m));
        }

        return models;
    }

    public List<PlaylistModelView> getPlaylists(){
        List<I_Playlist> playlists = new ArrayList<>();
        Playlist playlist1 = new Playlist("Rap Fr");
        playlists.add(new Playlist("Disco"));
        playlists.add(new Playlist("Dubstep"));
        playlists.add(new Playlist("Comptines et chansons"));

        List<PlaylistModelView> models = new ArrayList<>();
        for (I_Playlist p : playlists) {
            models.add(ModelViewBuilder.playlistToPlaylistModel(p));
        }

        return models;
    }
}
