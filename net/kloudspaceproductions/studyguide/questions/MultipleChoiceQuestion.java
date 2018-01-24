package net.kloudspaceproductions.studyguide.questions;

import net.kloudspaceproductions.studyguide.interfaces.IQuestion;
import net.kloudspaceproductions.studyguide.utils.ChapterKey;

public class MultipleChoiceQuestion implements IQuestion {
	
	private ChapterKey chapterKey;
	private Choice[] choices;
	private String title;
	private String question;
	
	public MultipleChoiceQuestion(ChapterKey key, String questionKey, String title, String question, Choice...choices) {
		this.chapterKey = key;
		this.choices = choices;
		this.title = title;
		this.question = question;
	}
	

	@Override
	public String getChapterKey() {
		return chapterKey.getChapterKey();
	}


	public Choice[] getChoices() {
		return choices;
	}


	public String getTitle() {
		return title;
	}


	@Override
	public String getQuestion() {
		return question;
	}

}
