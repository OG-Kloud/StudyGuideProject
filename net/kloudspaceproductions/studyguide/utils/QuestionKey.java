package net.kloudspaceproductions.studyguide.utils;

public class QuestionKey {
	
	public ChapterKey chapter;
	public String questionKey;
	
	public QuestionKey(ChapterKey cKey, String questionKey) {
		this.chapter = cKey;
		this.questionKey = questionKey;
	}
	
	public String getQuestionKey() {
		return chapter+"."+questionKey;
	}

}
