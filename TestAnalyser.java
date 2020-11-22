package com.assigments;

import org.junit.Test;
import org.junit.Assert;

public class TestAnalyser {
	@Test
	public void given_InSadMood_thenShouldBeSadMood() {
		MoodAnalyser moodAnalyser=new MoodAnalyser("I am in Sad Mood");
			Assert.assertEquals("SAD",moodAnalyser.analyseMood());
	}
	@Test
	public void given_InHappyMood_thenShouldBeHappyMood() {
		MoodAnalyser moodAnalyser=new MoodAnalyser("I am in any Mood");
			Assert.assertEquals("HAPPY",moodAnalyser.analyseMood());
	}
	@Test
	public void given_InNullMood_thenShouldBeHappyMood() {
		MoodAnalyser moodAnalyser=new MoodAnalyser(null);
			Assert.assertEquals("HAPPY",moodAnalyser.analyseMood());
	}

}
