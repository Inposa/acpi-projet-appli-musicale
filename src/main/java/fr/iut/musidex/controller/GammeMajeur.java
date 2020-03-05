package fr.iut.musidex.controller;

import fr.iut.musidex.entity.Tonalite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GammeMajeur { //FIXME : implement ring buffer java
    private static final Map<Tonalite, String> conv = new HashMap<>();

    static {
        conv.put(Tonalite.C, "Do");
        conv.put(Tonalite.D, "Re");
        conv.put(Tonalite.E, "Mi");
        conv.put(Tonalite.F, "Fa");
        conv.put(Tonalite.G, "Sol");
        conv.put(Tonalite.A, "La");
        conv.put(Tonalite.B, "Si");
    }

    public static ArrayList<String> getGammeMajeur(Tonalite ton){
        final ArrayList<String> noteMaj = new ArrayList<>(
                Arrays.asList("Do", "Do#", "Re", "Re#", "Mi", "Fa", "Fa#", "Sol", "Sol#", "La", "La#", "Si"));

        int i_note = noteMaj.indexOf(conv.get(ton));

        ArrayList<String> result = new ArrayList<>();
        result.add(conv.get(ton));
        for(int i = 0, j = 0;i<7;i++) {
            int a = (i_note + j + 1)%12;
            if (i == 2 || i == 6) {
                result.add(noteMaj.get(a));
                j++;
            } else {
                result.add(noteMaj.get(a+1));
                j=j+2;
            }
        }
        return result;
    }
}
