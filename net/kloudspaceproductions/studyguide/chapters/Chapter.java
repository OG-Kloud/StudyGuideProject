package net.kloudspaceproductions.studyguide.chapters;

import javax.swing.JFrame;

public class Chapter {
	
	private JFrame frameInstance;
	
	public Chapter(JFrame instance) {
		frameInstance = instance;
	}

	public JFrame getFrameInstance() {
		return frameInstance;
	}

	public void setFrameInstance(JFrame frameInstance) {
		this.frameInstance = frameInstance;
	}

}
