package fr.iut.musidex.controller;

import fr.iut.musidex.entity.I_Morceau;
import fr.iut.musidex.entity.I_Playlist;
import fr.iut.musidex.entity.Morceau;
import fr.iut.musidex.entity.Playlist;
import fr.iut.musidex.model.ModelBuilder;
import fr.iut.musidex.model.MorceauModel;
import fr.iut.musidex.model.PlaylistModel;

import java.util.ArrayList;
import java.util.List;

public class HomeController {

    public List<MorceauModel> getMorceaux(){
        List<I_Morceau> morceaux = new ArrayList<>();

        morceaux.add(new Morceau("morceau 1","Tony"));
        morceaux.add(new Morceau("morceau 2","James"));
        morceaux.add(new Morceau("morceau 3","Bella"));

        List<MorceauModel> models = new ArrayList<>();

        for (I_Morceau m : morceaux) {
            models.add(ModelBuilder.morceauToMorceauModel(m));
        }

        return models;
    }

    public List<PlaylistModel> getPlaylists(){
        List<I_Playlist> playlists = new ArrayList<>();
        playlists.add(new Playlist("Test1"));
        playlists.add(new Playlist("Test2"));
        playlists.add(new Playlist("Test3"));

        List<PlaylistModel> models = new ArrayList<>();
        for (I_Playlist p : playlists) {
            models.add(ModelBuilder.playlistToPlaylistModel(p));
        }

        return models;
    }



}
