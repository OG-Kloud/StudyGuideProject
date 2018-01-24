package net.kloudspaceproductions.studyguide;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import net.kloudspaceproductions.studyguide.components.ImageBoxLoader;
import net.kloudspaceproductions.studyguide.questions.QuestionHandler;

/**
 * 
 * @author Kloud
 *
 *
 *Object for the Chapter 1 GUI
 *planing to implement a wrapper for the chapter GUI
 */
@SuppressWarnings("serial")
public class Chapter1Gui extends JFrame implements ActionListener {
	//Top level JPanel to set as the frame contentPane
	public JPanel contentPane;

	public JPanel panel2;
	public JPanel panel3;
	
	//Buttons for each question on the GUI
	//Will change when the ChapterGUI Wrapper is implemented
	public JButton button1 = new JButton("Question1");
	public JButton button2 = new JButton("Question 2");
	public JButton button3 = new JButton("Question 3");
	public JButton button4 = new JButton("Question 4");
	public JButton button5 = new JButton("Question 5");
	public JButton button6 = new JButton("Question 6");
	public JButton button7 = new JButton("Question 7");
	public JButton button8 = new JButton("Question 8");
	public JButton button9 = new JButton("Question 9");
	public JButton button10 = new JButton("Question 10");
	public JButton backButton = new JButton("Back");
	
	/**
	 * Constructs the GUI instance and sets its {@link JFrame.isVisable} to false
	 * @throws IOException
	 */
	public Chapter1Gui() throws IOException {
		this.setSize(new Dimension(600, 800));
		this.contentPane = new JPanel();
		this.contentPane.setBackground(Color.CYAN);
		this.contentPane.setLayout(new BorderLayout());
		this.setContentPane(contentPane);
		this.initializeButtons();
		Box boxTop = new ImageBoxLoader("studyguide", 100, 50);
		boxTop.setSize(new Dimension(600, 200));
		this.contentPane.add(boxTop);
		Box left = new Box(BoxLayout.Y_AXIS);
		left.setSize(new Dimension(300, 600));
		left.add(Box.createRigidArea(new Dimension(300, 200)));
		left.add(button1);
		left.add(Box.createRigidArea(new Dimension(10,10)));
		left.add(button2);
		left.add(Box.createRigidArea(new Dimension(10,10)));
		left.add(button3);
		left.add(Box.createRigidArea(new Dimension(10,10)));
		left.add(button4);
		left.add(Box.createRigidArea(new Dimension(10,10)));
		left.add(button5);
		left.add(Box.createRigidArea(new Dimension(10,10)));
		left.add(button6);
		left.add(Box.createRigidArea(new Dimension(10,10)));
		left.add(button7);
		left.add(Box.createRigidArea(new Dimension(10,10)));
		left.add(button8);
		left.add(Box.createRigidArea(new Dimension(10,10)));
		left.add(button9);
		left.add(Box.createRigidArea(new Dimension(10,10)));
		left.add(button10);
		this.contentPane.add(left);
		Box right = new Box(BoxLayout.Y_AXIS);
		right.setSize(new Dimension(300, 400));
		right.add(Box.createRigidArea(new Dimension(300, 200)));
//		right.add(button3);
		this.contentPane.add(right);
		
		Box boxBottom = new ImageBoxLoader("logo", 300, 700);
		boxBottom.setSize(new Dimension(800, 600));
		this.contentPane.add(boxBottom);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	/**
	 * {@inheritDoc}
	 * 
	 * adds handlers for the JButtons
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			this.setVisible(false);
			QuestionHandler.getQuestionGui(QuestionHandler.questionc1q1).setVisible(true);;
		}
		if(e.getSource() == button2) {
			this.setVisible(false);
			QuestionHandler.getQuestionGui(QuestionHandler.questionc1q2).setVisible(true);
		}
		if(e.getSource() == button3) {
			this.setVisible(false);
			QuestionHandler.getQuestionGui(QuestionHandler.questionc1q3).setVisible(true);
		}
		if(e.getSource() == button4) {
			this.setVisible(false);
			QuestionHandler.getQuestionGui(QuestionHandler.questionc1q4).setVisible(true);
		}
		if(e.getSource() == button5) {
			this.setVisible(false);
			QuestionHandler.getQuestionGui(QuestionHandler.questionc1q5).setVisible(true);
		}
		if(e.getSource() == button6) {
			this.setVisible(false);
			QuestionHandler.getQuestionGui(QuestionHandler.questionc1q6).setVisible(true);
		}
		if(e.getSource() == backButton) {
			StudyGuide.getGuide().setVisible(true);
			this.setVisible(false);
		}
	}
	/**
	 * Initialized JButtons
	 * 
	 * called from the Constructor
	 */
	public void initializeButtons() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button10.addActionListener(this);
	}
	
	

}
