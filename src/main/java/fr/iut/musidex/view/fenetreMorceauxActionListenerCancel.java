package fr.iut.musidex.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fenetreMorceauxActionListenerCancel implements ActionListener {
	private boolean isEditing;
	private JFrame frame;
	private String conf;
	
	public fenetreMorceauxActionListenerCancel(boolean editing) {
		this.isEditing = editing;
		if(this.isEditing) {
			this.conf = "Annuler les changements ?";
		} else {
			this.conf = "Annuler la création ?";
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int result = JOptionPane.showConfirmDialog(
	            this.frame,
	            this.conf,
	            "Confirmation",
	            JOptionPane.YES_NO_OPTION);
		if(result == JOptionPane.YES_OPTION) {
			frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
		}
	}

}
