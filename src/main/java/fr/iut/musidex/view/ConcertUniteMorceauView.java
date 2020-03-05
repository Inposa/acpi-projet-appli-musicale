package fr.iut.musidex.view;


import fr.iut.musidex.controller.GammeMajeur;
import fr.iut.musidex.entity.Tonalite;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class ConcertUniteMorceauView extends JPanel {
    public ConcertUniteMorceauView() {
        initComponents();
        labelAlbumCover.setIcon(setImage("album", labelAlbumCover.getPreferredSize()));
        labelPartition.setIcon(setImage("partition", labelPartition.getPreferredSize()));
    }

    private ImageIcon setImage(String albumPart, Dimension dm){
        BufferedImage img;
        try {
            img = ImageIO.read(new File(albumPart+".png"));
            Image dimg = img.getScaledInstance((int) dm.getWidth(), (int) dm.getHeight(),
            Image.SCALE_SMOOTH);
            return new ImageIcon(dimg);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Impossible de charger l'image : " + albumPart);
            return null;
        }
    }

    private void initComponents() {
        lblPlaylist = new JLabel();
        lblTonaliteMaj = new JLabel();
        lblTonaliteMin = new JLabel();
        labelAlbumCover = new JLabel();
        labelPartition = new JLabel();
        labelPartie = new JLabel();
        labelTitre1 = new JLabel();
        txtInfoComp = new javax.swing.JTextArea();
        lblPlaylist.setFont(new java.awt.Font("Ubuntu", Font.PLAIN, 18)); // NOI18N
        lblPlaylist.setText("Nom Playlist");
        lblTonaliteMaj.setText("A Majeur");
        lblTonaliteMaj.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                labelTonaliteMouseClicked(evt);
            }
        });
        lblTonaliteMin.setText("/Mineur");
        lblTonaliteMin.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                labelTonaliteMinMouseClicked(evt);
            }
        });
        labelAlbumCover.setPreferredSize(new Dimension(150, 150));
        labelAlbumCover.setSize(150, 150);
        labelPartition.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPartition.setPreferredSize(new Dimension(400, 500));
        labelPartition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPartitionMouseClicked(evt);
            }
        });
        labelPartie.setFont(new java.awt.Font("Ubuntu", Font.PLAIN, 18)); // NOI18N
        labelPartie.setText("Partie");
        labelTitre1.setText("Titre");
        txtInfoComp.setEditable(false);
        txtInfoComp.setColumns(20);
        txtInfoComp.setRows(5);
        txtInfoComp.setText("informations complémentaires\n");
        txtInfoComp.setPreferredSize(new Dimension(400, 100));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPartition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelAlbumCover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelTitre1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTonaliteMaj)
                                .addComponent(lblTonaliteMin))
                            .addComponent(lblPlaylist))
                        .addGap(18, 18, 18)
                        .addComponent(labelPartie)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtInfoComp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlaylist)
                            .addComponent(labelPartie))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTitre1)
                            .addComponent(lblTonaliteMaj)
                            .addComponent(lblTonaliteMin)))
                    .addComponent(labelAlbumCover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(txtInfoComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPartition, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addContainerGap())
        );
        labelPartition.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lblTonaliteMaj.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lblTonaliteMin.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private void labelPartitionMouseClicked(java.awt.event.MouseEvent evt) {
        JDialog dialog = new JDialog();
        JPanel panel = new JPanel();
        Dimension dm = new Dimension(650,900);
        ImageIcon img = setImage("partition", dm);
        if(img != null){
            JLabel lbl = new JLabel(setImage("partition", dm));
            panel.add(lbl);
            dialog.setContentPane(panel);
            dm.setSize(dm.getWidth(), dm.getHeight()+40);
            dialog.setPreferredSize(dm);
            dialog.setMinimumSize(dm);
            dialog.setResizable(false);
            dialog.setModal(true);
            dialog.setTitle("Partition");
            dialog.setVisible(true);
        }
    }

    private void labelTonaliteMouseClicked(java.awt.event.MouseEvent evt){
        JOptionPane.showMessageDialog(this, GammeMajeur.getGammeMajeur(Tonalite.A), "Tonalité Majeur", JOptionPane.INFORMATION_MESSAGE);
    }

    private void labelTonaliteMinMouseClicked(java.awt.event.MouseEvent evt){
        JOptionPane.showMessageDialog(this, GammeMajeur.getGammeMineur(Tonalite.A), "Tonalité Mineur 3 ans de prison", JOptionPane.INFORMATION_MESSAGE);
    }

    private javax.swing.JTextArea txtInfoComp;
    private JLabel labelAlbumCover;
    private JLabel labelPartie;
    private JLabel labelPartition;
    private JLabel lblPlaylist;
    private JLabel labelTitre1;
    private JLabel lblTonaliteMaj;
    private JLabel lblTonaliteMin;
}
