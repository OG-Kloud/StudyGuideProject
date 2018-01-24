package net.kloudspaceproductions.studyguide.questions;

import net.kloudspaceproductions.studyguide.guis.KloudGui;
import net.kloudspaceproductions.studyguide.guis.MultiChoiceGui;
import net.kloudspaceproductions.studyguide.guis.TextResponseGui;
import net.kloudspaceproductions.studyguide.interfaces.IQuestion;
import net.kloudspaceproductions.studyguide.utils.ChapterKey;

public class QuestionHandler {
	
	public static IQuestion questionc1q1 = new MultipleChoiceQuestion(ChapterKey.getkeyForChapter(1), "question1",
			"Chapter 1 Question 1", "All information stored by a computer is stored in ____________ notation	",
			new Choice[] { new Choice("Base 2", true), new Choice("Hexidecimal", false), new Choice("Octal", false),
			new Choice("Base 10", false)
			});
	public static IQuestion questionc1q2 = new TextResponseQuestion(ChapterKey.getkeyForChapter(1), "question2",
			"Chapter 1 Question 2", "Name three input devices", new String[] { "mouse", "keyboard", "scanner", "mic"
			}, 3);
	public static IQuestion questionc1q3 = new MultipleChoiceQuestion(ChapterKey.getkeyForChapter(1), "question3",
			"Chapter 1 Question 3", "The _____ of the software life cycle is also called the coding phase",
			new Choice[] { new Choice("Analsys phase", false), new Choice("Design phase", false),
					new Choice("Implementation phase", true), new Choice("Maintenance phase", false)
			});
	public static IQuestion questionc1q4 = new MultipleChoiceQuestion(ChapterKey.getkeyForChapter(1), "question3",
			"Chapter 1 Question 3", "More than half of the cost of developing software goes to the __________ phase of "
					+ "software development",
			new Choice[] { new Choice("Analsys phase", false), new Choice("Design phase", false),
					new Choice("Implementation phase", false), new Choice("Maintenance phase", true)
			});
	public static IQuestion questionc1q5 = new TextResponseQuestion(ChapterKey.getkeyForChapter(1), "question5",
			"Chapter 1 Question 5", "What does ACM stand for?", new String[] {
					"Association for Computing Machinery"
			}, 1);
	public static IQuestion questionc1q6 = new MultipleChoiceQuestion(ChapterKey.getkeyForChapter(1), "question 6",
			"Chapter 1 Question 6", "What is 5 base 10 converted to base 2", new Choice[] { new Choice("102", false),
					new Choice("45B", false), new Choice("101", true), new Choice("111", false)
			});
	public QuestionHandler() {
		initialize();
	}
	
	public void initialize() {
		
	}
	
	public static KloudGui getQuestionGui(IQuestion question) {
		if(question instanceof MultipleChoiceQuestion) return new MultiChoiceGui((MultipleChoiceQuestion)question);
		if(question instanceof TextResponseQuestion) return new TextResponseGui((TextResponseQuestion)question);
		else return null;
	}

}
