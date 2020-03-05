/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.iut.musidex.view;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


/**
 *
 * @author gaidop
 */
public class ConcertView extends javax.swing.JFrame {

    
    public ConcertView() {
        initComponents();
        ConcertListMorceauxView morc = new ConcertListMorceauxView(1);
        ConcertUniteMorceauView unt = new ConcertUniteMorceauView();
        tabPanel.addTab("Liste", morc);
        tabPanel.addTab("Unité", unt);
        
        JList<String> listMrcx = ((ConcertListMorceauxView) tabPanel.getComponentAt(0)).getList();
        listMrcx.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt) {
               
                if (evt.getClickCount() == 2) {
                int index = listMrcx.locationToIndex(evt.getPoint());
                tabPanel.setSelectedIndex(1);               
                } 
            }
        });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabPanel = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane2.setMinimumSize(new java.awt.Dimension(500, 700));
        jScrollPane2.setViewportView(tabPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane tabPanel;
    // End of variables declaration//GEN-END:variables
}
