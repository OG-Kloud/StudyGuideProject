package net.kloudspaceproductions.studyguide.components;

import java.awt.Graphics;

import javax.swing.Box;
import javax.swing.BoxLayout;

import net.kloudspaceproductions.studyguide.utils.KloudResourceLoader;

public class ImageBoxLoader extends Box{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3216769588496321384L;
	private String key;
	private int widthOffset, heightOffset;
	
	public ImageBoxLoader(String imageKey, int widthOffset, int heightOffset) {
		super(BoxLayout.PAGE_AXIS);
		this.key = imageKey;
		this.widthOffset = widthOffset;
		this.heightOffset = heightOffset;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(KloudResourceLoader.getImage(key), widthOffset, heightOffset, null);
	}

}
