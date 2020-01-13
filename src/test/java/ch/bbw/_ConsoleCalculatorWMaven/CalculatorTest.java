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
	
	@Test
	public void testSubNegative() {
		testee = new Calculator();
		assertTrue(testee.subtraktion(10, 20) == -10);
		
	}
	
	@Test
	public void testAddNegative() {
		testee = new Calculator();
		assertTrue(testee.addition(-100, 10) == -90);
		
	}

}
