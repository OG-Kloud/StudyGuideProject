package net.kloudspaceproductions.studyguide.utils;

import java.util.ArrayList;
import java.util.List;

public class ChapterKey {
	
	private String chapterKey;
	
	private static List<ChapterKey> keys = new ArrayList<ChapterKey>();
	
	static {
		keys.add(0, new ChapterKey("c1"));
		keys.add(1, new ChapterKey("c2"));
	}
	
	public ChapterKey(String key) {
		this.chapterKey = key;
	}
	
	public String getChapterKey() {
		return chapterKey;
	}
	
	public static ChapterKey getkeyForChapter(int chapterNumber) {
		switch(chapterNumber) {
		case 1 :
			return keys.get(chapterNumber - 1);
			
			default :
				return keys.get(0);
		}
	}

}
