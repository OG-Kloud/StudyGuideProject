package net.kloudspaceproductions.studyguide.chapters;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.kloudspaceproductions.studyguide.Chapter1Gui;

public class ChapterHandler {
	
	private Chapter chapter1;
//	private Chapter chapter2;
	
	private Map<String, Chapter> chapters = new HashMap<String, Chapter>();
	
	public ChapterHandler() throws IOException {
		chapter1 = new Chapter(new Chapter1Gui());
		chapters.put("c1", chapter1);
	}
	
	public Chapter getChapter(String id) {
		return chapters.get(id);
	}

	public Chapter getChapter1() {
		return chapter1;
	}

}
