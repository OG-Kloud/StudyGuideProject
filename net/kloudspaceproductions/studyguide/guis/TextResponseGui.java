package net.kloudspaceproductions.studyguide.guis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.kloudspaceproductions.studyguide.StudyGuide;
import net.kloudspaceproductions.studyguide.components.ImageFrameLoader;
import net.kloudspaceproductions.studyguide.components.ImagePanelLoader;
import net.kloudspaceproductions.studyguide.interfaces.IQuestion;
import net.kloudspaceproductions.studyguide.questions.TextResponseQuestion;

@SuppressWarnings("serial")
public class TextResponseGui extends KloudGui {
	
	private JPanel content;
	private IQuestion question;
	private JButton backButton;
	private List<String> choices = new ArrayList<String>();
	private JLabel label;
	private JTextField textBox;
	
	
	public TextResponseGui(TextResponseQuestion question) {
		this.question = question;
		this.setTitle(question.getTitle());
		this.setSize(600, 800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(false);
		this.setResizable(false);
		backButton = new JButton("Back");
		content = new JPanel();
		content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
		content.setBackground(Color.CYAN);
		this.setContentPane(content);
		try {
			initialize();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void initialize() throws IOException {
		TextResponseQuestion quest = (TextResponseQuestion)question;
		for(String answer : quest.getAcceptable()) {
			choices.add(answer);
		}
		textBox = new JTextField("Enter you answers here");
		textBox.addActionListener(this);
		Box box = Box.createHorizontalBox();
		box.setBorder(BorderFactory.createEmptyBorder(200, 100, 100, 50));
		content.add(box);
		label = new JLabel(question.getQuestion());
		box.add(Box.createHorizontalGlue());
		box.add(label, BorderLayout.CENTER);
		box.add(Box.createHorizontalGlue());
		Box box1 = Box.createHorizontalBox();
		box1.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 10));
		content.add(box1);
		box1.add(Box.createHorizontalGlue());
		box1.add(textBox, BorderLayout.CENTER);
		box1.add(Box.createHorizontalGlue());
		JPanel panel = new ImagePanelLoader("logo", 375, 400);
		panel.setBackground(Color.CYAN);
		content.add(panel);
		panel.add(Box.createVerticalStrut(450));
		panel.add(backButton, BorderLayout.NORTH);
		backButton.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent action) {
		if(action.getSource() == backButton) {
			StudyGuide.getGuide().getChapterHandler().getChapter(question.getChapterKey()).getFrameInstance().setVisible(true);
			this.setVisible(false);
		}
		if(action.getSource() == textBox) {
			int i = 0;
			for(String s : choices) {
				if(textBox.getText().toUpperCase().contains(s.toUpperCase())) i++;
			}
			if(textBox.getText().toUpperCase().contains(choices.get(0))) i++;
			System.out.println("numer of correct answers detected : " +i);
			if(i >= ((TextResponseQuestion)question).getNumberOfAnswersNeeded()) {
				try {
					
					JFrame frame = new ImageFrameLoader();
					frame.setVisible(true);
					this.setVisible(false);
					Timer t = new Timer();
					t.schedule(new TimerTask() {

						@Override
						public void run() {
							frame.setVisible(false);
						}
					
					}, 2000);
					t.schedule(new TimerTask() {

						@Override
						public void run() {
							StudyGuide.getGuide().getChapterHandler().getChapter(question.getChapterKey()).getFrameInstance().setVisible(true);
						}
						
					}, 2200);	
				} catch(Exception exc) {
					exc.printStackTrace();
				}
			}
		}
	}

	public JPanel getContent() {
		return content;
	}

	public IQuestion getQuestion() {
		return question;
	}

	public JButton getBackButton() {
		return backButton;
	}

	public List<String> getChoices() {
		return choices;
	}

	public JLabel getLabel() {
		return label;
	}
	
	

}
