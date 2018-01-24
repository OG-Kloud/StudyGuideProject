package net.kloudspaceproductions.studyguide.utils;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class KloudResourceLoader {
	
	public static BufferedImage correct;
	public static BufferedImage logo;
	public static BufferedImage studyGuide;
	public static BufferedImage chapter1;
	
	public void initialize() throws IOException {
		System.out.println("Initializing resource Loader");
		correct = ImageIO.read(getClass().getResource("correct.png"));
		System.out.println("loaded correct.png");
		logo = ImageIO.read(getClass().getResource("logo.png"));
		System.out.println("loaded logo.png");
		studyGuide = ImageIO.read(getClass().getResource("studyguide.png"));
		System.out.println("loaded studyguide.png");
		chapter1 = ImageIO.read(getClass().getResource("chapter1.png"));
		System.out.println("loaded chapter1.png");
	}
	
	public static BufferedImage getImage(String key) {
		switch(key) {
		case "correct" :
			return correct;
		case "studyguide" :
			return studyGuide;
		case "chapter1" :
			return chapter1;
		default :
			return logo;
		}
	}

}
