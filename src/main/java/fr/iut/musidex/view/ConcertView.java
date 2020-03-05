package fr.iut.musidex.view;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ConcertView extends JFrame {
    private ConcertListMorceauxView listMorceaux;
    private ConcertUniteMorceauView uniteMorceaux;
    
    public ConcertView() {
        initComponents();
        listMorceaux = new ConcertListMorceauxView(1);
        uniteMorceaux = new ConcertUniteMorceauView();
        tabPanel.addTab("Liste", listMorceaux);
        tabPanel.addTab("Unité", uniteMorceaux);
        
        JList<String> listMrcx = ((ConcertListMorceauxView) tabPanel.getComponentAt(0)).getList();
        listMrcx.setSelectedIndex(0);
        listMrcx.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt) {
                if (SwingUtilities.isLeftMouseButton(evt) && evt.getClickCount() == 2) {
                    int index = listMrcx.locationToIndex(evt.getPoint());
                    tabPanel.setSelectedIndex(1);
                } 
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        slp = new javax.swing.JScrollPane();
        tabPanel = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        slp.setMinimumSize(new java.awt.Dimension(500, 700));
        slp.setViewportView(tabPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(slp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(slp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        pack();
    }


    private javax.swing.JScrollPane slp;
    private javax.swing.JTabbedPane tabPanel;
}
