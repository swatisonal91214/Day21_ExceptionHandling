package com.bl.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void analyseSadMood() {
		DemoException analyser = new DemoException();

		String actualResult = analyser
				.analyseMood("I am in sad mood");

		assertEquals("SAD", actualResult);
	}

	@Test
	public void analyseHappyMood() {
		DemoException analyser = new DemoException();

		String actualResult = analyser
				.analyseMood("I am in happy mood");

		assertEquals("HAPPY", actualResult);
	}

	@Test
	public void analyseNullMood() {
		DemoException analyser = new DemoException();

		String actualResult = analyser.analyseMood(null);

		assertEquals("Invalid input", actualResult);
	}

}
