package com.assigments;

import org.junit.Test;
import org.junit.Assert;

public class TestAnalyser {
	@Test
	public void given_InSadMood_thenShouldBeSadMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		try {
			Assert.assertEquals("SAD", moodAnalyser.analyseMood());
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void given_InHappyMood_thenShouldBeHappyMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any Mood");
		try {
			Assert.assertEquals("HAPPY", moodAnalyser.analyseMood());
		} catch (MoodAnalysisException e) {

			e.printStackTrace();
		}
	}

	@Test
	public void given_InNullMood_thenShouldThrowMoodAnalysisException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.getType());
			e.printStackTrace();
		}
	}

}
