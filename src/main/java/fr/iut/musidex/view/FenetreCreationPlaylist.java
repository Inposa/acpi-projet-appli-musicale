/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.iut.musidex.view;

import fr.iut.musidex.controller.ControllerCreation;
import fr.iut.musidex.entity.I_Morceau;
import fr.iut.musidex.entity.Morceau;
import fr.iut.musidex.entity.Partie;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import java.util.ArrayList;

/**
 *
 * @author diazt
 */
public class FenetreCreationPlaylist extends javax.swing.JFrame {

    private ControllerCreation controller = new ControllerCreation();
    private DefaultListModel modelBiblio;
    private DefaultListModel modelPlaylist;
    private DefaultTreeModel modelTree;
    private int nbMorceaux = 0;

    /**
     * Creates new form FenetreCreationPlaylist
     */
    public FenetreCreationPlaylist() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        modelBiblio = (DefaultListModel) listBibliotheque.getModel();
        modelTree = (DefaultTreeModel) treeParties.getModel();
        ArrayList<I_Morceau> lesMorceaux = controller.getBibliotheque();
        for (I_Morceau unMorceau : lesMorceaux) {
            modelBiblio.addElement(unMorceau);
        }
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listBibliotheque = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        btnValider = new javax.swing.JButton();
        txtfieldNomPlaylist = new javax.swing.JTextField();
        btnAjouter = new javax.swing.JButton();
        btnRetirer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        treeParties = new javax.swing.JTree();
        btnAddPartie = new javax.swing.JButton();
        btnRemovePartie = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelNbMorceaux = new javax.swing.JLabel();
        btnDeplacerHaut = new javax.swing.JButton();
        btnDeplacerBas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listBibliotheque.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(listBibliotheque);

        jLabel1.setText("Bilbiothèque");

        btnValider.setText("Créer la playlist");
        btnValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValiderActionPerformed(evt);
            }
        });

        btnAjouter.setText(">");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnRetirer.setText("<");
        btnRetirer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirerActionPerformed(evt);
            }
        });

        jLabel3.setText("Nom de la playlist : ");

        DefaultMutableTreeNode treeNode1 = new DefaultMutableTreeNode("Playlist");
        treeParties.setModel(new DefaultTreeModel(treeNode1));
        jScrollPane4.setViewportView(treeParties);

        btnAddPartie.setText("Ajouter partie");
        btnAddPartie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPartieActionPerformed(evt);
            }
        });

        btnRemovePartie.setText("Supprimer partie");
        btnRemovePartie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePartieActionPerformed(evt);
            }
        });

        jLabel4.setText("Playlist");

        jLabel5.setText("Nombre de morceaux :");

        labelNbMorceaux.setText("0");

        btnDeplacerHaut.setText("^");
        btnDeplacerHaut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeplacerHautActionPerformed(evt);
            }
        });

        btnDeplacerBas.setText("v");
        btnDeplacerBas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeplacerBasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAjouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRetirer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfieldNomPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDeplacerBas, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDeplacerHaut, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnValider)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNbMorceaux)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemovePartie)
                            .addComponent(btnAddPartie))))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtfieldNomPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(labelNbMorceaux)
                    .addComponent(btnAddPartie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemovePartie)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnDeplacerHaut, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDeplacerBas, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRetirer, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnValider)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        if (!listBibliotheque.isSelectionEmpty() && !treeParties.isSelectionEmpty()) {
            DefaultMutableTreeNode partie = (DefaultMutableTreeNode) treeParties.getSelectionPath().getLastPathComponent();
            if(partie.getUserObject().getClass() == Partie.class) {
                MutableTreeNode child = new DefaultMutableTreeNode(listBibliotheque.getSelectedValue());
                partie.insert(child, partie.getChildCount());
                modelTree.reload();
                modelBiblio.removeElement(listBibliotheque.getSelectedValue());
            
                openAllNodes();
            
                nbMorceaux++;
                labelNbMorceaux.setText("" + nbMorceaux);
            }
        }
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void btnRetirerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirerActionPerformed
        if (!treeParties.isSelectionEmpty()) {
            DefaultMutableTreeNode morceau = (DefaultMutableTreeNode) treeParties.getSelectionPath().getLastPathComponent();
            if(morceau.getUserObject().getClass() == Morceau.class) {
                modelBiblio.addElement(morceau);
                modelTree.removeNodeFromParent(morceau);
                modelTree.reload();
                nbMorceaux--;
                labelNbMorceaux.setText("" + nbMorceaux);
                //  labelNbMorceaux.setText("" + modelPlaylist.getSize());
                openAllNodes();
            }
        }
    }//GEN-LAST:event_btnRetirerActionPerformed

    private void btnValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValiderActionPerformed
        
        if (nbMorceaux > 0) {
            //ArrayList<I_Morceau> lesMorceaux = controller.getBibliotheque();
            String nomPlaylist = txtfieldNomPlaylist.getText();
            nomPlaylist = nomPlaylist.trim();
            if (!nomPlaylist.isEmpty()) {
                /*
                Playlist playlist = new Playlist(nomPlaylist);
                int i = 0;
                while (i < nbMorceaux) {
                    String nomMorceaux = modelPlaylist.get(i++).toString();
                    for (I_Morceau morceau : lesMorceaux) {
                        if (nomMorceaux.equals(morceau.getNom())) {
                            playlist.ajouterMorceau(morceau);
                        }
                    }
                }*/
                JOptionPane.showMessageDialog(this, "La playlist " + nomPlaylist + " a bien été créée.");
            } else {
                JOptionPane.showMessageDialog(this, "Erreur : la playlist doit avoir un nom");
            }
        } else {
            JOptionPane.showMessageDialog(this, "La playlist ne peut pas être vide.");
        }
        
    }//GEN-LAST:event_btnValiderActionPerformed

    private void btnAddPartieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPartieActionPerformed
        String nomPartie = JOptionPane.showInputDialog("Nom de la partie");
        if (!nomPartie.trim().isEmpty()) {
            MutableTreeNode root = (MutableTreeNode) modelTree.getRoot();
            MutableTreeNode child = new DefaultMutableTreeNode(new Partie(nomPartie));
            modelTree.insertNodeInto(child, root, 0);
              modelTree.reload();
              openAllNodes();
        }
        else{
        JOptionPane.showMessageDialog(this, "La partie doit avoir un nom.");
        }

    }//GEN-LAST:event_btnAddPartieActionPerformed

    private void btnRemovePartieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovePartieActionPerformed
        if (!treeParties.isSelectionEmpty()) {
            DefaultMutableTreeNode partie = (DefaultMutableTreeNode) treeParties.getSelectionPath().getLastPathComponent();
            if(partie.getUserObject().getClass() == Partie.class) {
                modelTree.removeNodeFromParent(partie);
            }
        }       
    }//GEN-LAST:event_btnRemovePartieActionPerformed

    private void btnDeplacerHautActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeplacerHautActionPerformed
        MutableTreeNode partie = (MutableTreeNode) treeParties.getSelectionPath().getLastPathComponent();
        MutableTreeNode partieQuiEtaitEnHaut;
        MutableTreeNode parent = (MutableTreeNode) partie.getParent();
        int partieBougeante = parent.getIndex(partie);
        System.out.println(partieBougeante);
        if(partieBougeante != 0){
            partieQuiEtaitEnHaut = (MutableTreeNode) parent.getChildAt(partieBougeante-1);
            System.out.println(partieBougeante);
            parent.insert(partie, partieBougeante-1);
            parent.insert(partieQuiEtaitEnHaut, partieBougeante);
            modelTree.reload();
        }
        openAllNodes();
        
        
    }//GEN-LAST:event_btnDeplacerHautActionPerformed

    private void btnDeplacerBasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeplacerBasActionPerformed
        MutableTreeNode partie = (MutableTreeNode) treeParties.getSelectionPath().getLastPathComponent();
        MutableTreeNode partieQuiEtaitEnBas;
        MutableTreeNode parent = (MutableTreeNode) partie.getParent();
        int partieBougeante = parent.getIndex(partie);
        System.out.println(partieBougeante);
        if(partieBougeante != parent.getChildCount()-1){
            partieQuiEtaitEnBas = (MutableTreeNode) parent.getChildAt(partieBougeante+1);
            System.out.println(partieBougeante);
            parent.insert(partie, partieBougeante+1);
            parent.insert(partieQuiEtaitEnBas, partieBougeante);
            modelTree.reload();
        }
        openAllNodes();
    }//GEN-LAST:event_btnDeplacerBasActionPerformed

    public void openAllNodes(){
    for (int i = 0; i < treeParties.getRowCount(); i++) {
                treeParties.expandRow(i);
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPartie;
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnDeplacerBas;
    private javax.swing.JButton btnDeplacerHaut;
    private javax.swing.JButton btnRemovePartie;
    private javax.swing.JButton btnRetirer;
    private javax.swing.JButton btnValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelNbMorceaux;
    private javax.swing.JList<String> listBibliotheque;
    private javax.swing.JTree treeParties;
    private javax.swing.JTextField txtfieldNomPlaylist;
    // End of variables declaration//GEN-END:variables
}
