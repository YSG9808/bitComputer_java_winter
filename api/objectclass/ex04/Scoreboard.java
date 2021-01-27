package com.javaex.api.objectclass.ex04;

public class Scoreboard implements Cloneable {
	private int scores[];
	
	//	생성자
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}

	public Scoreboard getClone() {
		Scoreboard clone = null;
		
		try {
			clone = (Scoreboard)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
	
	@Override
	public String toString() {
		String output = "Scoreboard(";
		
		for (int i = 0; i < scores.length; i++) {
			output += scores[i];
			if (i < scores.length - 1) {
				output += ",";
			}
		}
		output += ")";
		
		return output;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	
	
}
