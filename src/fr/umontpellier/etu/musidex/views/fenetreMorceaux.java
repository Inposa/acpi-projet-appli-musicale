package fr.umontpellier.etu.musidex.views;

import java.awt.EventQueue;
import java.net.*;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Canvas;
import java.awt.Desktop;

import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JTextArea;

import fr.umontpellier.etu.musidex.modele.Tonalite;

public class fenetreMorceaux {

	private JFrame frame;
	private JTextField txtTitre;
	private JTextArea txtCommentaire;
	
	private List<String> tonalites;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fenetreMorceaux window = new fenetreMorceaux();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void initTonalites() {
		for(Tonalite t : Tonalite.values()) {
			this.tonalites.add(t.name());
		}
	}

	/**
	 * Create the application.
	 */
	public fenetreMorceaux() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setAutoRequestFocus(false);
		frame.setBounds(100, 100, 836, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btAjouterMorceau = new JButton("Ajouter le morceau");
		btAjouterMorceau.setBounds(224, 404, 190, 25);
		btAjouterMorceau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO: Créé le morceau si text bt = "Ajouter le morceau" sinon modifié le morceau.
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btAjouterMorceau);
		
		JButton btAnnuler = new JButton("Annuler");
		btAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO: Annule l'enregistrement du morceau si text bt = Annule sinon Supprime morceau existant.
			}
		});
		btAnnuler.setEnabled(false);
		btAnnuler.setBounds(425, 404, 190, 25);
		frame.getContentPane().add(btAnnuler);
		
		JLabel lblNomMorceau = new JLabel("Titre Morceau :");
		lblNomMorceau.setBounds(50, 48, 114, 15);
		frame.getContentPane().add(lblNomMorceau);
		
		JLabel lblCommentaires = new JLabel("Commentaires :");
		lblCommentaires.setBounds(50, 161, 148, 15);
		frame.getContentPane().add(lblCommentaires);
		
		txtTitre = new JTextField();
		txtTitre.setBounds(171, 46, 114, 20);
		frame.getContentPane().add(txtTitre);
		txtTitre.setColumns(10);
		
		txtCommentaire = new JTextArea();
		txtCommentaire.setLineWrap(true);
		txtCommentaire.setColumns(10);
		txtCommentaire.setBounds(60, 188, 450, 165);
		frame.getContentPane().add(txtCommentaire);
		
		JLabel lblInfos = new JLabel("Infos");
		lblInfos.setFont(new Font("Dialog", Font.BOLD, 17));
		lblInfos.setBounds(400, 12, 49, 15);
		frame.getContentPane().add(lblInfos);
		
		JLabel lblTonalitOriginale = new JLabel("Tonalité Originale :");
		lblTonalitOriginale.setBounds(302, 48, 148, 15);
		frame.getContentPane().add(lblTonalitOriginale);
		
		JLabel lblTonalitJoue = new JLabel("Tonalité Jouée :");
		lblTonalitJoue.setBounds(525, 46, 114, 15); 
		frame.getContentPane().add(lblTonalitJoue);
		
		JButton btVidDuMorceau = new JButton("Vidéo du morceau");
		btVidDuMorceau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String lien = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
				    Desktop.getDesktop().browse(new URL(lien).toURI());
				} catch (Exception e1) {}
			}
		});
		btVidDuMorceau.setBounds(118, 96, 190, 25);
		frame.getContentPane().add(btVidDuMorceau);
		
		JButton btOuvrirPartition = new JButton("Ouvrir la partition");
		btOuvrirPartition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//TODO: faire cela avec l'objet recup en param
					String lien = "https://sheets-piano.ru/wp-content/uploads/2012/02/Rick-Astley-Never-Gonna-Give-You-Up.pdf";
					Desktop.getDesktop().browse(new URL(lien).toURI());
				} catch (Exception e1) {}
			}
		});
		btOuvrirPartition.setBounds(320, 96, 190, 25);
		frame.getContentPane().add(btOuvrirPartition);
		
		JButton btOuvrirParole = new JButton("Ouvrir les paroles");
		btOuvrirParole.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//TODO: faire cela avec l'objet recup en param
					String lien = "https://www.azlyrics.com/lyrics/rickastley/nevergonnagiveyouup.html";
				Desktop.getDesktop().browse(new URL(lien).toURI());
				} catch (Exception e1) {}
				
			}
		});
		
		btOuvrirParole.setBounds(522, 96, 190, 25);
		frame.getContentPane().add(btOuvrirParole);
		
		JComboBox cbTonOriginale = new JComboBox();
		cbTonOriginale.setBounds(453, 46, 54, 20);
		frame.getContentPane().add(cbTonOriginale);
		
		JComboBox cbTonJouee = new JComboBox();
		cbTonJouee.setBounds(646, 46, 54, 20);
		frame.getContentPane().add(cbTonJouee);
	}
}
