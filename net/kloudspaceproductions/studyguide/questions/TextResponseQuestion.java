package net.kloudspaceproductions.studyguide.questions;

import net.kloudspaceproductions.studyguide.interfaces.IQuestion;
import net.kloudspaceproductions.studyguide.utils.ChapterKey;

public class TextResponseQuestion implements IQuestion {
	
	private ChapterKey chapterKey;
	private String[] acceptable;
	private String title;
	private String question;
	private int numberOfAnswersNeeded;
	
	public TextResponseQuestion(ChapterKey key, String questionKey, String title, String question, String[] answers, int needed) {
		this.chapterKey = key;
		this.acceptable = answers;
		this.title = title;
		this.question = question;
		this.numberOfAnswersNeeded = needed;
	}

	public String getChapterKey() {
		return chapterKey.getChapterKey();
	}

	public String[] getAcceptable() {
		return acceptable;
	}

	public String getTitle() {
		return title;
	}

	public String getQuestion() {
		return question;
	}

	public int getNumberOfAnswersNeeded() {
		return numberOfAnswersNeeded;
	}

}
