package com.bl.exception;

import org.junit.jupiter.api.Test;

public class DivisionTest {

	@Test
	public void testDiv() {
		DemoException analyser = new DemoException();
		analyser.expression(10, 0);
	}

	
}
