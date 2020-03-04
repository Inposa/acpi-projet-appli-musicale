///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package fr.iut.musidex.view;
//
//
//import fr.iut.musidex.controller.ControllerCreation;
//import fr.iut.musidex.entity.I_Morceau;
//import fr.iut.musidex.entity.Playlist;
//
//import java.util.ArrayList;
//import javax.swing.DefaultListModel;
//
//import javax.swing.JOptionPane;
//
///**
// * @author diazt
// */
//public class FenetreCreationPlaylist extends javax.swing.JFrame {
//
//    private ControllerCreation controller = new ControllerCreation();
//    private DefaultListModel modelBiblio;
//    private DefaultListModel modelPlaylist;
//
//    /**
//     * Creates new form FenetreCreationPlaylist
//     */
//    public FenetreCreationPlaylist() {
//        initComponents();
//        modelBiblio = (DefaultListModel) listBibliotheque.getModel();
//        modelPlaylist = (DefaultListModel) listMorceauxPlaylist.getModel();
//        ArrayList<I_Morceau> lesMorceaux = controller.getBibliotheque();
//        for (I_Morceau unMorceau : lesMorceaux) {
//            modelBiblio.addElement(unMorceau.getNom());
//        }
//
//    }
//
//    /**
//     * This method is called from within the constructor to initialize the form.
//     * WARNING: Do NOT modify this code. The content of this method is always
//     * regenerated by the Form Editor.
//     */
//    @SuppressWarnings("unchecked")
//    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
//    private void initComponents() {
//
//        jScrollPane1 = new javax.swing.JScrollPane();
//        listBibliotheque = new javax.swing.JList<>();
//        jLabel1 = new javax.swing.JLabel();
//        btnValider = new javax.swing.JButton();
//        txtfieldNomPlaylist = new javax.swing.JTextField();
//        jLabel2 = new javax.swing.JLabel();
//        btnAjouter = new javax.swing.JButton();
//        btnRetirer = new javax.swing.JButton();
//        jLabel3 = new javax.swing.JLabel();
//        jScrollPane2 = new javax.swing.JScrollPane();
//        listMorceauxPlaylist = new javax.swing.JList<>();
//
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//
//        listBibliotheque.setModel(new DefaultListModel());
//        jScrollPane1.setViewportView(listBibliotheque);
//
//        jLabel1.setText("Bilbiothèque");
//
//        btnValider.setText("Créer la playlist");
//        btnValider.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btnValiderActionPerformed(evt);
//            }
//        });
//
//        jLabel2.setText("Morceaux de la playlist");
//
//        btnAjouter.setText(">");
//        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btnAjouterActionPerformed(evt);
//            }
//        });
//
//        btnRetirer.setText("<");
//        btnRetirer.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btnRetirerActionPerformed(evt);
//            }
//        });
//
//        jLabel3.setText("Nom de la playlist : ");
//
//        listMorceauxPlaylist.setModel(new DefaultListModel());
//        jScrollPane2.setViewportView(listMorceauxPlaylist);
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(layout.createSequentialGroup()
//                                .addContainerGap()
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                                        .addComponent(jLabel1)
//                                        .addGroup(layout.createSequentialGroup()
//                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                                        .addComponent(btnAjouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                                        .addComponent(btnRetirer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
//                                        .addGroup(layout.createSequentialGroup()
//                                                .addComponent(jLabel3)
//                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                                                .addComponent(txtfieldNomPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addGroup(layout.createSequentialGroup()
//                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
//                                                .addComponent(btnValider)
//                                                .addContainerGap())
//                                        .addGroup(layout.createSequentialGroup()
//                                                .addComponent(jLabel2)
//                                                .addGap(0, 0, Short.MAX_VALUE))))
//        );
//        layout.setVerticalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                                .addContainerGap()
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                                        .addComponent(jLabel3)
//                                        .addComponent(txtfieldNomPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addGroup(layout.createSequentialGroup()
//                                                .addGap(41, 41, 41)
//                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                                                        .addComponent(jLabel2)
//                                                        .addComponent(jLabel1))
//                                                .addGap(9, 9, 9)
//                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
//                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
//                                                        .addGroup(layout.createSequentialGroup()
//                                                                .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                                .addGap(18, 18, 18)
//                                                                .addComponent(btnRetirer, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                                .addGap(0, 183, Short.MAX_VALUE))))
//                                        .addGroup(layout.createSequentialGroup()
//                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                                .addComponent(btnValider)))
//                                .addContainerGap())
//        );
//
//        pack();
//    }// </editor-fold>//GEN-END:initComponents
//
//    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
//        modelPlaylist.addElement(listBibliotheque.getSelectedValue());
//        modelBiblio.removeElement(listBibliotheque.getSelectedValue());
//
//    }//GEN-LAST:event_btnAjouterActionPerformed
//
//    private void btnRetirerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirerActionPerformed
//        modelBiblio.addElement(listMorceauxPlaylist.getSelectedValue());
//        modelPlaylist.removeElement(listMorceauxPlaylist.getSelectedValue());
//    }//GEN-LAST:event_btnRetirerActionPerformed
//
//    private void btnValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValiderActionPerformed
//        int nbMorceaux = modelPlaylist.getSize();
//        if (nbMorceaux > 0) {
//            ArrayList<I_Morceau> lesMorceaux = controller.getBibliotheque();
//            String nomPlaylist = txtfieldNomPlaylist.getText();
//            nomPlaylist = nomPlaylist.trim();
//            if (!nomPlaylist.isEmpty()) {
//                Playlist playlist = new Playlist(nomPlaylist);
//                int i = 0;
//                while (i < nbMorceaux) {
//                    String nomMorceaux = modelPlaylist.get(i++).toString();
//                    for (I_Morceau morceau : lesMorceaux) {
//                        if (nomMorceaux.equals(morceau.getNom())) {
//                            playlist.ajouterMorceau(morceau);
//                        }
//                    }
//                }
//                JOptionPane.showMessageDialog(this, "La playlist " + playlist.getNom() + " a bien été créée.");
//            } else {
//                JOptionPane.showMessageDialog(this, "Erreur : la playlist doit avoir un nom");
//            }
//        } else {
//            JOptionPane.showMessageDialog(this, "La playlist ne peut pas être vide.");
//        }
//    }//GEN-LAST:event_btnValiderActionPerformed
//
//
//    // Variables declaration - do not modify//GEN-BEGIN:variables
//    private javax.swing.JButton btnAjouter;
//    private javax.swing.JButton btnRetirer;
//    private javax.swing.JButton btnValider;
//    private javax.swing.JLabel jLabel1;
//    private javax.swing.JLabel jLabel2;
//    private javax.swing.JLabel jLabel3;
//    private javax.swing.JScrollPane jScrollPane1;
//    private javax.swing.JScrollPane jScrollPane2;
//    private javax.swing.JList<I_Morceau> listBibliotheque;
//    private javax.swing.JList<I_Morceau> listMorceauxPlaylist;
//    private javax.swing.JTextField txtfieldNomPlaylist;
//    // End of variables declaration//GEN-END:variables
//}
