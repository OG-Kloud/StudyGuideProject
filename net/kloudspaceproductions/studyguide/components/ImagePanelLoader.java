package net.kloudspaceproductions.studyguide.components;

import java.awt.Graphics;

import javax.swing.JPanel;

import net.kloudspaceproductions.studyguide.utils.KloudResourceLoader;

public class ImagePanelLoader extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3657907831862059512L;
	
	private String key;
	private int widthOffset, heightOffset;
	
	public ImagePanelLoader(String imageKey, int widthOffset, int heightOffset) {
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
