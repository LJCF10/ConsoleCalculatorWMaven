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
	public void testaddone() {
		assertTrue(testee.addition(-100, 0) == -100);
		
	}
	
	@Test
	public void testaddtwo() {
		assertTrue(testee.addition(100, -100) == 0);	
	}
	
	@Test 
	public void testMinVal() {
		assertTrue(testee.addition(Integer.MIN_VALUE, 1)== -2147483647);
	}
	
	@Test
	public void testaddfour() {
		assertTrue(testee.addition(-10, -40) == -50);
		
	}
	
	@Test
	public void testaddfive() {
		assertTrue(testee.addition(-10, 20) == 10);	
	}
	
	@Test
	public void testaddsix() {
		assertTrue(testee.addition(10, -20) == -10);	
	}
	
	@Test
	public void testAddNegative() {
		assertTrue(testee.addition(-100, 10) == -90);
		
	}
	
	@Test
	public void testSubPositiv() {
		assertTrue(testee.subtraktion(20, 10) == 10);
		
	}
	
	@Test
	public void testSubNegative() {
		assertTrue(testee.subtraktion(10, 20) == -10);
		
	}
	
	
	@Test
	public void testsubone() {
		assertTrue(testee.subtraktion(10, 0) == 10);
		
	}
	
	@Test
	public void testsubtwo() {
		assertTrue(testee.subtraktion(-10, -10) == 0);
		
	}
		
	@Test
	public void testsubthree() {
		assertTrue(testee.subtraktion(100, 100) == 0);
		
	}
	
	@Test
	public void testsubfour() {
		assertTrue(testee.subtraktion(-10, 20) == -30);	
	}
	
	@Test 
	public void testMaxVal() {
		assertTrue(testee.subtraktion(Integer.MAX_VALUE, 1)== 2147483646);
	}
	
	@Test 
	public void testsubfive() {
		assertTrue(testee.subtraktion(10, -10) == 20);
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
	
	@Test
	public void testdivone() {
		assertTrue(testee.division(10, 2)== 5);
	}
	
	@Test
	public void testdivtwo() {
		assertTrue(testee.division(-10, -2)== 5);
	}
	
	@Test
	public void testdivthree() {
		assertTrue(testee.division(-10, 2)== -5);
	}
	
	@Test
	public void testdivfour() {
		assertTrue(testee.division(10, -2)== -5);
	}
	
	@Test
	public void testdivfive() {
		assertTrue(testee.division(10, 2)== 5);
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
	


	

}
