package com.assigments;

public class MoodAnalyser {
	String message;

	public MoodAnalyser() {
		// TODO Auto-generated constructor stub
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		try {
			if (message.contains("I am in Sad Mood"))
				return "SAD";
			else
				return "HAPPY";

		} catch (NullPointerException e) {
				return "HAPPY";
		}
	}
}
