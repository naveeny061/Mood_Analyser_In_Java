package com.assigments;

import org.junit.Test;
import org.junit.Assert;

public class TestAnalyser {
	@Test
	public void given_InSadMood_thenShouldBeSadMood() {
		MoodAnalyser moodAnalyser=new MoodAnalyser("I am in Sad Mood");
			Assert.assertEquals("SAD",moodAnalyser.analyseMood());
	}
	

}
