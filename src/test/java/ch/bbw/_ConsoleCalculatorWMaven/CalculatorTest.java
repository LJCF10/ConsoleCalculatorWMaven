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
		assertTrue(testee.addition(-100, 10) == -90);
		
	}
	
	//catched exception und ignoriert diese weil diese erwartete wird
	@Test(expected=ArithmeticException.class)
	public void testExpEx() {
		
		assertTrue(testee.division(100, 0) == 0);
		
	}
	
	//ignoriert exception test wird failen 
	@Test
	public void testUnexpEx() {
		try {
			assertTrue(testee.division(10, 2)== 5);
			}
		catch(ArithmeticException e) {
			System.out.println(e);
			
		}		
	}
	
	//protected functions müssen im gleichen Package sein zum getestet werden
	@Test 
	public void testprotected(){
		Protectedfunc a = new Protectedfunc();
		assertTrue(a.addenzwei(2, 3) == 5);
	}
	
	//private functions soll man nicht testen
	// Aber wwenn man das trotzdem tun möchte, dann kann man mit Hilfe von einem PriviligedAccessor 
	// Das ACcess Mechanisumus ändern
	
	@Test
	public void testextraone() {
		assertTrue(testee.addition(-100, 0) == -100);
		
	}
	
	@Test
	public void testextratwo() {
		assertTrue(testee.subtraktion(10, 0) == 10);
		
	}
	
	@Test
	public void testextrathree() {
		assertTrue(testee.subtraktion(-10, -10) == 0);
		
	}
	
	@Test
	public void testextrafour() {
		assertTrue(testee.addition(-10, -40) == -50);
		
	}
	
	@Test
	public void testextrafive() {
		assertTrue(testee.subtraktion(100, 100) == 0);
		
	}
	
	@Test
	public void testextrasix() {
		assertTrue(testee.addition(100, -100) == 0);
	}
	
	@Test
	public void testextraseven() {
		assertTrue(testee.addition(-10, 20) == 10);	
	}
	
	@Test
	public void testextraeight() {
		assertTrue(testee.subtraktion(-10, 20) == -30);	
	}
	
	@Test 
	public void testMaxVal() {
		assertTrue(testee.subtraktion(Integer.MAX_VALUE, 1)== 2147483646);
	}
	
	@Test 
	public void testMinVal() {
		assertTrue(testee.addition(Integer.MIN_VALUE, 1)== -2147483647);
	}
}
