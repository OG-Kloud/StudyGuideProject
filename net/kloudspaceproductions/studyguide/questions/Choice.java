package net.kloudspaceproductions.studyguide.questions;

public class Choice {
	
	private String choiceText;
	private boolean isCorrect = false;
	
	public Choice(String text, boolean isCorrect) {
		this.choiceText = text;
		this.isCorrect = isCorrect;
	}

	public String getChoiceText() {
		return choiceText;
	}
	
	public boolean isCorrect() {
		return isCorrect;
	}

}
