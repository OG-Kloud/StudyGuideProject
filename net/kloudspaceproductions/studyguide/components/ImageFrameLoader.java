package net.kloudspaceproductions.studyguide.components;

import javax.swing.JFrame;
import javax.swing.JPanel;

import net.kloudspaceproductions.studyguide.Main;

public class ImageFrameLoader extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2170734918686344217L;

	public ImageFrameLoader() {
		this.setSize(650, 650);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(false);
		JPanel panel;
		panel = new ImagePanelLoader("correct", 0, 0);
		this.setContentPane(panel);
		Main.user.incrCount(true);
	}
	

}
