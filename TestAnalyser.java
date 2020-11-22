package com.assigments;

import org.junit.Test;
import org.junit.Assert;

public class TestAnalyser {
	@Test
	public void given_InSadMood_thenShouldBeSadMood() {
		MoodAnalyser moodAnalyser=new MoodAnalyser();
			Assert.assertEquals("SAD",moodAnalyser.analyseMood("I am in Sad Mood"));
	}
	@Test
	public void given_InHappyMood_thenShouldBeHappyMood() {
		MoodAnalyser moodAnalyser=new MoodAnalyser();
			Assert.assertEquals("HAPPY",moodAnalyser.analyseMood("I am in any Mood"));
	}

}