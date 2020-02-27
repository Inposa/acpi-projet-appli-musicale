package fr.iut.musidex.model;

import fr.iut.musidex.entity.I_Morceau;
import fr.iut.musidex.entity.I_Playlist;

public class ModelBuilder {

    public static MorceauModel morceauToMorceauModel(I_Morceau morceau){
        MorceauModel morceauModel = new MorceauModel();
        morceauModel.setNom(morceau.getNom());
        return morceauModel;
    }

    public static PlaylistModel playlistToPlaylistModel(I_Playlist playlist){
        PlaylistModel playlistModel = new PlaylistModel();
        playlistModel.setNom(playlist.getNom());
        return playlistModel;
    }

}
