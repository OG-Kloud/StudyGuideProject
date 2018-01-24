package net.kloudspaceproductions.studyguide;

import java.io.File;
import java.nio.file.Paths;

import javax.swing.SwingUtilities;
/**
 * A program to practice my Java skills
 * hopefully useful to somebody
 */
public class Main {
	/**
	 * Holds a reference to the save location
	 * 
	 * currently not fully implemented
	 */
	public static File dir;
	/**
	 * Holds a reference to the StudyGuideUser instance of the current user
	 * 
	 * !!Not Functioning!!
	 */
	public static StudyGuideUser user;
	
	public static void main(String[] args) {
		dir = new File(Paths.get("").toAbsolutePath().getParent().toFile(), "StudyGuide");
		dir.mkdirs();
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new StudyGuideLogin();
			}
		});
	}

}
