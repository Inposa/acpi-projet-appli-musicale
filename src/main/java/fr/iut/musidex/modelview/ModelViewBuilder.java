package fr.iut.musidex.modelview;

import fr.iut.musidex.entity.I_Morceau;
import fr.iut.musidex.entity.I_Playlist;
import java.util.HashSet;

public class ModelViewBuilder {

    public static MorceauModelView morceauToMorceauModel(I_Morceau morceau){
        MorceauModelView morceauModelView = new MorceauModelView();
        morceauModelView.setNom(morceau.getNom());
        morceauModelView.setInterprete(morceau.getInterprete());
        morceauModelView.setDuree(String.valueOf(morceau.getDuree()));
        morceauModelView.setTonalite(morceau.getTonalite().toString());
        
        return morceauModelView;
    }

    public static PlaylistModelView playlistToPlaylistModel(I_Playlist playlist){
        PlaylistModelView playlistModelView = new PlaylistModelView();
        playlistModelView.setNom(playlist.getNom());
        //playlistModelView.setNbMorceaux(playlist.getMorceaux().length);
        return playlistModelView;
    }

}
