package net.kloudspaceproductions.studyguide.guis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class KloudGui extends JFrame implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.setVisible(false);
	}

}
