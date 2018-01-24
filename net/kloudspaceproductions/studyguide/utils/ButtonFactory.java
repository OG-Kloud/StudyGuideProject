package net.kloudspaceproductions.studyguide.utils;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import net.kloudspaceproductions.studyguide.questions.Choice;

public class ButtonFactory {
	
	public static JButton createButton(Choice choice,  ActionListener listener) {
		JButton button = new JButton(choice.getChoiceText());
		button.addActionListener(listener);
		return button;
	}


}
