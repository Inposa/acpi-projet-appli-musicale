/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.iut.musidex.view;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;


public class ConcertListMorceauxView extends JPanel {
    private Map<Integer, String> morceaux = new HashMap<>();
    
    public ConcertListMorceauxView(int idPlaylist) {
        initComponents();    
        
        morceaux.put(1, "Trop beau - Lomepal - 3:30");
        morceaux.put(2, "Morceau 2 - Artiste - 10:10");
        morceaux.put(3, "Morceau 3 - Artiste - 10:10");
        morceaux.put(4, "Morceau 4 - Artiste - 10:10");
        morceaux.put(5, "Morceau 5 - Artiste - 10:10");
        
        
        //model pour la liste
        DefaultListModel<String> model = (DefaultListModel<String>)lstMorceaux.getModel();
        
        //morceaux = controlleur.getMorceaux........;
        
        //parcours des morceaux
        for(int morceauID : morceaux.keySet()) {
            model.addElement(morceauID + " - " + morceaux.get(morceauID));
        }

    }

    JList<String> getList() {
        return lstMorceaux;
    }

    private void initComponents() {
        slp = new JScrollPane();
        lstMorceaux = new JList<>();
        setPreferredSize(new Dimension(424, 677));
        lstMorceaux.setFont(new Font("Ubuntu", Font.PLAIN, 18)); // NOI18N
        lstMorceaux.setModel(new DefaultListModel<>());
        slp.setViewportView(lstMorceaux);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(slp, GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(slp)
        );
    }

    private JScrollPane slp;
    private JList<String> lstMorceaux;
}
