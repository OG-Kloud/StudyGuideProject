package net.kloudspaceproductions.studyguide;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.kloudspaceproductions.studyguide.utils.KWriter;

public class StudyGuideLogin extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -418814555021302724L;
	private JPanel content;
	private JButton submit;
	private JTextField field;
	
	public StudyGuideLogin() {
		this.setTitle("Login");
		this.setSize(200, 300);
		this.setResizable(false);
		content = new JPanel();
		content.setBackground(Color.CYAN);
		this.setContentPane(content);
		this.field = new JTextField("Enter username");
		this.field.setToolTipText("Enter a userName really any name will work");
		this.content.add(field);
		this.setVisible(true);
		this.submit = new JButton("Submit");
		this.content.add(submit);
		submit.addActionListener(this);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

	private void tryLogin() {
		try {
			KWriter writer = new KWriter(Main.dir);
			if(writer.getFileNames().contains(field.getText())) {
				List<String> aList = writer.readOneFile(field.getText());
				Main.user = new StudyGuideUser(aList);
			} else {
				Main.user = new StudyGuideUser(field.getText());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == submit) {
			this.setVisible(false);
			tryLogin();
		}
	}


}
