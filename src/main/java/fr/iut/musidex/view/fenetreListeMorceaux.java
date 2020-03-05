package main.java.fr.iut.musidex.view;

import java.awt.EventQueue;
import java.net.*;

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
import javax.swing.JDialog;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import java.awt.List;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class fenetreListeMorceaux {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fenetreListeMorceaux window = new fenetreListeMorceaux();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public fenetreListeMorceaux() {
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
		
		JButton btAjouterMorceau = new JButton("Ajouter un morceau");
		btAjouterMorceau.setBounds(129, 404, 190, 25);
		btAjouterMorceau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fenetreMorceaux fenetre = new fenetreMorceaux();
				
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btAjouterMorceau);
		
		JButton btAnnuler = new JButton("Supprimer le morceau");
		btAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO: Appel vers fenêtreMorceaux avec l'action Supprimer et l'objet du morceau à suppr
			}
		});
		btAnnuler.setEnabled(false);
		btAnnuler.setBounds(533, 404, 190, 25);
		frame.getContentPane().add(btAnnuler);
		
		JLabel lblInfos = new JLabel("Listes des morceaux");
		lblInfos.setFont(new Font("Dialog", Font.BOLD, 17));
		lblInfos.setBounds(331, 12, 200, 15);
		frame.getContentPane().add(lblInfos);
		
		JButton btModifierLeMorceau = new JButton("Modifier le morceau");
		btModifierLeMorceau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//fenetreMorceaux fenetre = new fenetreMorceaux()
			}
		});
		btModifierLeMorceau.setEnabled(false);
		btModifierLeMorceau.setBounds(331, 404, 190, 25);
		frame.getContentPane().add(btModifierLeMorceau);
		
		List list = new List();
		list.add("test");
		list.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				 if (e.getStateChange() == ItemEvent.SELECTED) {
				        btModifierLeMorceau.setEnabled(true);
				        btAnnuler.setEnabled(true);
				    } else {
				    	btAnnuler.setEnabled(false);
				    }
			}
		});
		list.setMultipleSelections(false);
		list.setBounds(107, 77, 616, 282);
		frame.getContentPane().add(list);
	}
}
