package com.ppranay.jd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
	Calculator c;

	@Before
	public void setUp() throws Exception {
		c = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		c = null;
	}

	@Test
	public void testSum() {
		assertEquals(100, c.sum(10, 20, 30, 40));
	}

	@Test
	public void testSquare() {
		assertEquals(225, c.square(15));
	}
}
