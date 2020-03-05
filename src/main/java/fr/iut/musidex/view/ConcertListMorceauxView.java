/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.iut.musidex.view;

import fr.iut.musidex.controller.LiveModeController;

import javax.swing.*;
import java.awt.*;
import java.util.Map;


public class ConcertListMorceauxView extends JPanel {

    
    public ConcertListMorceauxView(int idPlaylist) {
        Map<Integer, String> morceaux = LiveModeController.getBasicMorceauInfoFromPlaylist(idPlaylist);
        initComponents();
        
        //model pour la liste
        DefaultListModel<String> model = (DefaultListModel<String>)lstMorceaux.getModel();
        
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
