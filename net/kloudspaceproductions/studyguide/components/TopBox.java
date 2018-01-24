package net.kloudspaceproductions.studyguide.components;

import java.awt.Graphics;

import javax.swing.Box;
import javax.swing.BoxLayout;

import net.kloudspaceproductions.studyguide.utils.KloudResourceLoader;

@SuppressWarnings("serial")
public class TopBox extends Box {
	
	private int widthOffset = 100, heightOffset = 50;

	public TopBox() {
		super(BoxLayout.PAGE_AXIS);
	}
	
	public TopBox(int w, int h) {
		this();
		widthOffset = w;
		heightOffset = h;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(KloudResourceLoader.studyGuide, widthOffset, heightOffset, null);
	}

}
