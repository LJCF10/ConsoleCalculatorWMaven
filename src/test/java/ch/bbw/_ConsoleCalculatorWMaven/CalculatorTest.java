package ch.bbw._ConsoleCalculatorWMaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	Calculator testee;

	@Test
	public void testAddPositiv() {
		testee = new Calculator();
		assertTrue(testee.addition(2, 10) == 12);
		
	}
	
	@Test
	public void testSubPositiv() {
		testee = new Calculator();
		assertTrue(testee.subtraktion(20, 10) == 10);
		
	}

}
