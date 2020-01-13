package ch.bbw._ConsoleCalculatorWMaven;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator testee;
	
	@Before 
	public void setUP() {
		testee = new Calculator();
	}
	

	@Test
	public void testAddPositiv() {
		
		assertTrue(testee.addition(2, 10) == 12);
		
	}
	
	@Test
	public void testSubPositiv() {
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
