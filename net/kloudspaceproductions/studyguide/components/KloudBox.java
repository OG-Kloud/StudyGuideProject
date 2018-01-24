package net.kloudspaceproductions.studyguide.components;

import java.awt.Graphics;

import javax.swing.Box;
import javax.swing.BoxLayout;

import net.kloudspaceproductions.studyguide.utils.KloudResourceLoader;

@SuppressWarnings("serial")
public class KloudBox extends Box {

	public KloudBox() {
		super(BoxLayout.PAGE_AXIS);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(KloudResourceLoader.logo, 0, 600, null);
	}

}
