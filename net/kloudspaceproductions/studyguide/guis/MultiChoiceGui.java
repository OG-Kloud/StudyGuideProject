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
import javax.swing.JPanel;
import javax.swing.JTextArea;

import net.kloudspaceproductions.studyguide.StudyGuide;
import net.kloudspaceproductions.studyguide.components.ImageFrameLoader;
import net.kloudspaceproductions.studyguide.components.ImagePanelLoader;
import net.kloudspaceproductions.studyguide.interfaces.IQuestion;
import net.kloudspaceproductions.studyguide.questions.Choice;
import net.kloudspaceproductions.studyguide.questions.MultipleChoiceQuestion;

@SuppressWarnings("serial")
public class MultiChoiceGui extends KloudGui {
	
	private JPanel content;
	private IQuestion question;
	List<JButton> buttons;
	List<JButton> answers;
	private JButton backButton;
	List<Choice> choices = new ArrayList<Choice>();
//S	private JLabel label;
	private JTextArea text;
	
	public MultiChoiceGui(MultipleChoiceQuestion question) {
		this.question = question;
		this.setTitle(question.getTitle());
		this.setSize(600, 800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(false);
		this.setResizable(false);
		backButton = new JButton("Back");
		content = new JPanel();
		content.setLayout(new BoxLayout(content, BoxLayout.PAGE_AXIS));
		content.setBackground(Color.CYAN);
		this.setContentPane(content);
		try {
			initialize();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void initialize() throws IOException {
		buttons = new ArrayList<JButton>();
		answers = new ArrayList<JButton>();
		MultipleChoiceQuestion quest = ((MultipleChoiceQuestion) question);
		for(Choice choice : quest.getChoices()) {
			choices.add(choice);
		}
		Box box = Box.createHorizontalBox();
//		box.add(Box.createVerticalStrut(200));
		box.setBorder(BorderFactory.createEmptyBorder(200, 100, 100, 50));
		content.add(box);
		text = new JTextArea(question.getQuestion());
		text.setLineWrap(true);
		text.setAlignmentY(CENTER_ALIGNMENT);
		text.setBackground(Color.CYAN);
		box.add(Box.createHorizontalGlue());
		box.add(text, BorderLayout.CENTER);
		box.add(Box.createHorizontalGlue());
		Box box1 = Box.createHorizontalBox();
		box1.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 10));
		content.add(box1);
		for(Choice choice : choices) {
			JButton button = new JButton(choice.getChoiceText());
			if(choice.isCorrect()) answers.add(button);
			else buttons.add(button);
			box1.add(button);
			button.addActionListener(this);
		}
		JPanel panel = new ImagePanelLoader("logo", 375, 300);
		panel.setBackground(Color.CYAN);
		content.add(panel);
		panel.add(Box.createVerticalStrut(450));
		panel.add(backButton);
		backButton.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent action) {
		if(action.getSource() == backButton) {
			StudyGuide.getGuide().getChapterHandler().getChapter(question.getChapterKey()).getFrameInstance().setVisible(true);
			this.setVisible(false);
		}
		if(answers.contains(action.getSource())) {
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

	public IQuestion getQuestion() {
		return question;
	}

	public List<JButton> getButtons() {
		return buttons;
	}

	public List<JButton> getAnswers() {
		return answers;
	}

	public JButton getBackButton() {
		return backButton;
	}
	
	
	

}
