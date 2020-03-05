/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.iut.musidex.view;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class ConcertListMorceauxView extends javax.swing.JPanel {
    private Map<Integer, String> morceaux = new HashMap<>();
    
    public ConcertListMorceauxView(int idPlaylist) {
        initComponents();    
        
        morceaux.put(1, "Trop beau - Lomepal - 3:30");
        morceaux.put(2, "Morceau 2 - Artiste - 10:10");
        morceaux.put(3, "Morceau 3 - Artiste - 10:10");
        morceaux.put(4, "Morceau 4 - Artiste - 10:10");
        morceaux.put(5, "Morceau 5 - Artiste - 10:10");
        
        
        //model pour la liste
        DefaultListModel model = new DefaultListModel();
        
        //morceaux = controlleur.getMorceaux........;
        
        //parcours des morceaux
        Iterator morceauIterator = morceaux.entrySet().iterator();
        while(morceauIterator.hasNext()){
            Map.Entry mapEntry = (Map.Entry) morceauIterator.next();
            model.addElement(mapEntry.getKey().toString() + " - " + mapEntry.getValue());
        }
        
        listeMorceaux.setModel(model);
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listeMorceaux = new JList<>();

        setPreferredSize(new java.awt.Dimension(424, 677));

        listeMorceaux.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        listeMorceaux.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listeMorceaux.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listeMorceauxMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listeMorceaux);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listeMorceauxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeMorceauxMouseClicked
        // TODO add your handling code here:
        JList list = (JList)evt.getSource();
        if (evt.getClickCount() == 2) {
            int index = list.locationToIndex(evt.getPoint());
        }
    }

    private javax.swing.JScrollPane jScrollPane1;
    private JList<String> listeMorceaux;

    JList<String> getList() {
        return listeMorceaux;
    }
}
