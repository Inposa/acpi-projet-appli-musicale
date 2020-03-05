package fr.iut.musidex.modelview;

import fr.iut.musidex.entity.I_Morceau;
import fr.iut.musidex.entity.I_Partie;
import fr.iut.musidex.entity.I_Playlist;

public class ModelViewBuilder {

    private ModelViewBuilder(){}

    public static MorceauModelView morceauToMorceauModel(I_Morceau morceau){
        MorceauModelView morceauModelView = new MorceauModelView();
        morceauModelView.setNom(morceau.getNom());
        morceauModelView.setInterprete(morceau.getInterprete());
        morceauModelView.setDuree(String.valueOf(morceau.getDuree()));
        morceauModelView.setTonalite(morceau.getTonalite().toString());
        morceauModelView.setId(morceau.getId());
        
        return morceauModelView;
    }

    public static PlaylistModelView playlistToPlaylistModel(I_Playlist playlist){
        PlaylistModelView playlistModelView = new PlaylistModelView();
        playlistModelView.setNom(playlist.getNom());
        playlistModelView.setId(playlist.getId());

        int nb = getNbMorceauxFromPlayList(playlist);

        playlistModelView.setNbMorceaux(nb);
        return playlistModelView;
    }

    private static int getNbMorceauxFromPlayList(I_Playlist playlist) {
        int nb = 0;
        for (I_Partie p : playlist.getParties()) {
            nb += p.getMorceaux().size();
        }
        return nb;
    }

}
