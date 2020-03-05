package fr.iut.musidex.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fenetreMorceauxActionListenerCreate implements ActionListener {
	private boolean isEditing;
	
	public fenetreMorceauxActionListenerCreate(boolean editing) {
		this.isEditing = editing;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(this.isEditing) {
			
		}
	}

}
