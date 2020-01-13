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
	
	@Test(expected=ArithmeticException.class)
	public void testExpEx() {
		testee = new Calculator();
		assertTrue(testee.division(100, 0) == 0);
		
	}
	
	@Test
	public void testextraone() {
		testee = new Calculator();
		assertTrue(testee.addition(-100, 0) == -100);
		
	}
	
	@Test
	public void testextratwo() {
		testee = new Calculator();
		assertTrue(testee.subtraktion(10, 0) == 10);
		
	}
	
	@Test
	public void testextrathree() {
		testee = new Calculator();
		assertTrue(testee.subtraktion(-10, -10) == -20);
		
	}
	
	@Test
	public void testextrafour() {
		testee = new Calculator();
		assertTrue(testee.addition(-10, -40) == -50);
		
	}
	
	@Test
	public void testextrafive() {
		testee = new Calculator();
		assertTrue(testee.subtraktion(100, 100) == 0);
		
	}
	
	@Test
	public void testextrasix() {
		testee = new Calculator();
		assertTrue(testee.addition(100, -100) == 0);
	}
	
	@Test
	public void testextraseven() {
		testee = new Calculator();
		assertTrue(testee.addition(-10, 20) == 10);	
	}
	
	@Test
	public void testextraeight() {
		testee = new Calculator();
		assertTrue(testee.subtraktion(-10, 20) == -30);	
	}

}
