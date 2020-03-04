package fr.iut.musidex.modelview;

import fr.iut.musidex.entity.I_Morceau;
import fr.iut.musidex.entity.I_Playlist;

public class ModelViewBuilder {

    public static MorceauModelView morceauToMorceauModel(I_Morceau morceau){
        MorceauModelView morceauModelView = new MorceauModelView();
        morceauModelView.setNom(morceau.getNom());
        return morceauModelView;
    }

    public static PlaylistModelView playlistToPlaylistModel(I_Playlist playlist){
        PlaylistModelView playlistModelView = new PlaylistModelView();
        playlistModelView.setNom(playlist.getNom());

        return playlistModelView;
    }

}
