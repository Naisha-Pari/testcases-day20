package testcases;

import static org.junit.Assert.*;

import org.junit.Test;

public class passw {

	@Test
	public void testfindMax() {
		//testcase1 obj = new testcase1();
		assertEquals(true,cases.isValidPassword("Seevs@poal20"));
	}
	
	@Test
	public void testfindMax1() {
		//testcase1 obj = new testcase1();
		assertEquals(false,cases.isValidPassword("Nehachaurasias"));
		
	}
	@Test
	public void emailValidations() {
		//testcase1 obj = new testcase1();
		assertEquals(true,emailvalidation.verifyEmail("nasnans@blail.co.in"));
		
	}
	
}
