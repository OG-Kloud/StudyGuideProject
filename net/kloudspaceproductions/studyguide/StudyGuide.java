package net.kloudspaceproductions.studyguide;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import net.kloudspaceproductions.studyguide.chapters.ChapterHandler;
import net.kloudspaceproductions.studyguide.components.ImageBoxLoader;
import net.kloudspaceproductions.studyguide.components.ImagePanelLoader;
import net.kloudspaceproductions.studyguide.questions.QuestionHandler;
import net.kloudspaceproductions.studyguide.utils.KloudResourceLoader;

/**
 * @author Kloud
 * A simple program to develop my java skills.
 * Should also provide usefully to myself and my class as it is updated through the semester
 */
@SuppressWarnings("serial")
public class StudyGuide extends JFrame implements ActionListener {
	
	private JPanel contentPane;
	private JPanel panel2;
	private JButton button1;
//	private JButton button2;
	private static StudyGuide guide;
	private ChapterHandler chapterHandler;
	private QuestionHandler questionHandler;
	public KloudResourceLoader resourceLoader = new KloudResourceLoader();
	
	public StudyGuide() throws IOException {
		System.out.println("StudyGuide Application started");
		initialize();
		contentPane = new JPanel();
		this.setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
		contentPane.setBackground(Color.CYAN);
		Box box = new ImageBoxLoader("studyguide", 100, 50);
		box.add(Box.createVerticalStrut(200));
		contentPane.add(box);
		Box box1 = Box.createVerticalBox();
		box1.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 10));
		button1 = new JButton("Chapter 1");
		contentPane.add(box1);
//		box1.add(Box.createRigidArea(new Dimension(600,200)));
		box1.add(button1);
		button1.addActionListener(this);
		button1.setToolTipText("Select to review Chapter 1");
		panel2 = new ImagePanelLoader("logo", 375, 450);
		panel2.setBackground(Color.CYAN);
		contentPane.add(panel2);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600, 800);
		this.setVisible(true);
		this.setResizable(false);
		resourceLoader.initialize();
		guide = this;
	}

	@Override
	public void actionPerformed(ActionEvent action) {
		if(action.getSource() == this.button1) {
			this.setVisible(false);
			chapterHandler.getChapter1().getFrameInstance().setVisible(true);
		}
		
	}

	public static StudyGuide getGuide() {
		return guide;
	}
	
	public void initialize() {
		System.out.println("Initializing Chapter Handler");
		try {
			chapterHandler = new ChapterHandler();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Initializing Question Handler");
		questionHandler = new QuestionHandler();
	}

	public ChapterHandler getChapterHandler() {
		return chapterHandler;
	}

	public QuestionHandler getQuestionHandler() {
		return questionHandler;
	}


}
