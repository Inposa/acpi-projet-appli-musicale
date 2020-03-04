package fr.umontpellier.etu.musidex.views;

import java.awt.EventQueue;
import java.net.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Desktop;

import javax.swing.JComboBox;
import javax.swing.JTextArea;

import fr.umontpellier.etu.musidex.modele.Morceau;
import fr.umontpellier.etu.musidex.modele.Tonalite;

public class fenetreMorceaux {

	private JFrame frame;
	private JTextField txtTitre;
	private JTextArea txtCommentaire;
	private String[] tonalites;
	private JTextField txtLienVideo;
	private JTextField txtLienPartition;
	private JTextField txtLienParole;
	private JTextField txtInterprete;
	
	private boolean isEditing;

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
		int totalTonalites = Tonalite.values().length;
		this.tonalites = new String[totalTonalites];
		int i=0;
		for(Tonalite ton : Tonalite.values()) {
			tonalites[i] = ton.toString();
			i++;
		}
		System.out.println(this.tonalites);
	}

	/**
	 * Create the application.
	 */
	public fenetreMorceaux() {
		initialize();
		this.isEditing = false;
	}
	
	public fenetreMorceaux(Morceau m) {
		initialize();
		remplirChamps(m);
		this.isEditing = true;
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
				//TODO: Créé le morceau si text bt = "Ajouter le morceau" sinon modifié le morceau
				
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btAjouterMorceau);
		
		JButton btAnnuler = new JButton("Annuler");
		btAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO: Annule l'enregistrement du morceau si entrée = "Ajout" sinon annule les modifications si entrée = "Modif"
			}
		});
		btAnnuler.setBounds(425, 404, 190, 25);
		frame.getContentPane().add(btAnnuler);
		
		JLabel lblNomMorceau = new JLabel("Titre Morceau :");
		lblNomMorceau.setBounds(50, 48, 114, 15);
		frame.getContentPane().add(lblNomMorceau);
		
		JLabel lblCommentaires = new JLabel("Commentaires :");
		lblCommentaires.setBounds(50, 195, 148, 15);
		frame.getContentPane().add(lblCommentaires);
		
		txtTitre = new JTextField();
		txtTitre.setBounds(171, 46, 114, 20);
		frame.getContentPane().add(txtTitre);
		txtTitre.setColumns(10);
		
		txtCommentaire = new JTextArea();
		txtCommentaire.setLineWrap(true);
		txtCommentaire.setColumns(10);
		txtCommentaire.setBounds(60, 222, 450, 152);
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
					String lien = txtLienVideo.getText();
				    Desktop.getDesktop().browse(new URL(lien).toURI());
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Le lien n'est pas valide !", "Erreur", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btVidDuMorceau.setBounds(50, 158, 211, 25);
		frame.getContentPane().add(btVidDuMorceau);
		
		JButton btOuvrirPartition = new JButton("Ouvrir la partition");
		btOuvrirPartition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String lien = txtLienPartition.getText();
					Desktop.getDesktop().browse(new URL(lien).toURI());
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Le lien n'est pas valide !", "Erreur", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btOuvrirPartition.setBounds(295, 158, 211, 25);
		frame.getContentPane().add(btOuvrirPartition);
		
		JButton btOuvrirParole = new JButton("Ouvrir les paroles");
		btOuvrirParole.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String lien = txtLienParole.getText();
				Desktop.getDesktop().browse(new URL(lien).toURI());
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Le lien n'est pas valide !", "Erreur", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		
		btOuvrirParole.setBounds(524, 158, 212, 25);
		frame.getContentPane().add(btOuvrirParole);
		
		this.initTonalites();
		
		JComboBox<String> cbTonOriginale = new JComboBox<String>(this.tonalites);
		
		cbTonOriginale.setBounds(453, 46, 54, 20);
		frame.getContentPane().add(cbTonOriginale);
		
		JComboBox<String> cbTonJouee = new JComboBox<String>(this.tonalites);
		cbTonJouee.setBounds(646, 46, 54, 20);
		frame.getContentPane().add(cbTonJouee);
		
		JLabel lblLienVid = new JLabel("Lien vidéo :");
		lblLienVid.setBounds(50, 109, 114, 15);
		frame.getContentPane().add(lblLienVid);
		
		JLabel lblLienPartition = new JLabel("Lien Partition :");
		lblLienPartition.setBounds(295, 109, 114, 15);
		frame.getContentPane().add(lblLienPartition);
		
		JLabel lblLienParole = new JLabel("Lien paroles :");
		lblLienParole.setBounds(525, 109, 114, 15);
		frame.getContentPane().add(lblLienParole);
		
		txtLienVideo = new JTextField();
		txtLienVideo.setColumns(10);
		txtLienVideo.setBounds(50, 126, 211, 20);
		frame.getContentPane().add(txtLienVideo);
		
		txtLienPartition = new JTextField();
		txtLienPartition.setColumns(10);
		txtLienPartition.setBounds(295, 126, 211, 20);
		frame.getContentPane().add(txtLienPartition);
		
		txtLienParole = new JTextField();
		txtLienParole.setColumns(10);
		txtLienParole.setBounds(525, 126, 211, 20);
		frame.getContentPane().add(txtLienParole);
		
		JLabel lblInterprete = new JLabel("Interprète :");
		lblInterprete.setBounds(50, 79, 114, 15);
		frame.getContentPane().add(lblInterprete);
		
		txtInterprete = new JTextField();
		txtInterprete.setColumns(10);
		txtInterprete.setBounds(171, 77, 114, 20);
		frame.getContentPane().add(txtInterprete);
		
		frame.setVisible(true);
	}

	private void remplirChamps(Morceau m) {
		this.txtTitre.setText(m.getNom());
		this.txtInterprete.setText(m.getInterprete());
		this.txtLienVideo.setText(m.getLienYT());
	}
}
