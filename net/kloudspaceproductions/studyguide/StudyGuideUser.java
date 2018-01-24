package net.kloudspaceproductions.studyguide;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.kloudspaceproductions.studyguide.utils.KWriter;

public class StudyGuideUser {
	
	private String name;
	private double score;
	private int correct;
	private int total;
	
	public StudyGuideUser(String name) {
		this.name = name;
		score = 0;
		initialize();
	}
	
	public StudyGuideUser(List<String> args) {
		name = args.get(0);
		score = Double.parseDouble(args.get(1));
		correct = Integer.parseInt(args.get(2));
		total = Integer.parseInt(args.get(3));
		initialize();
	}
	
	public void initialize() {
		try {
			new StudyGuide();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void save() throws IOException {
		KWriter writer = new KWriter(Main.dir);
		List<String> aList = new ArrayList<String>();
		aList.add(name);
		aList.add(String.valueOf(score));
		aList.add(String.valueOf(correct));
		aList.add(String.valueOf(total));
		writer.writeFile(aList);
	}

	public void incrCount(boolean b) {
		this.total++;
		if(b) this.correct++;
		recalculate();
		try {
			save();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private double recalculate() {
		return this.score = correct/total;
	}

}
