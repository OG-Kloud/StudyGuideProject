package net.kloudspaceproductions.studyguide.components;

import java.awt.Graphics;

import javax.swing.JPanel;

import net.kloudspaceproductions.studyguide.utils.KloudResourceLoader;

@SuppressWarnings("serial")
public class KloudPanel extends JPanel {
	
	public KloudPanel() {
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(KloudResourceLoader.correct, 0, 0, null);
	}
	
	

}
