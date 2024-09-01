package io.javabrains.juint_5_basics;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class MathUtilsTest {

	MathUtils mathUtils;
	
	@BeforeEach
	void init() { //This method gets run before each method. So we get new instance of MathUtils class before each method.
		mathUtils = new MathUtils();
	}
	
	@Test
	@DisplayName("Testing add method")
	void testAdd() {
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		//		assertEquals(expected, actual);
		assertEquals(expected, actual, "The add method should add 2 numbers");
	}

	@Test
	@EnabledOnOs(OS.LINUX)
	@DisplayName("Mehod which runs on Linux only")
	void testComputeCircleAreaTest() {
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "This method should return correct area of circle");
	}
	
	
	//Imp assertThrows
	@Test
	void testDivide() {
		boolean isServerUp = false; 
		assumeTrue(isServerUp);  //Now this entire testDivide method get's run only when server is up. Otherwise it will skip this test
		
		//		assertThrows(NullPointerException.class, ()-> mathUtils.divide(1, 0), "Divide by zero should throw ArithmeticException"); //fails
		assertThrows(ArithmeticException.class, ()-> mathUtils.divide(1, 0), "Divide by zero should throw ArithmeticException");
	}
	
	@Test
	@Disabled
	@DisplayName("TDD method should not run") //TDD : Test driven development
	void testDisabled() {
		fail("This test should be disabled");
	}
	
	@AfterEach
	void cleanup() {
		System.out.println("Cleaning up...");
	}
	
}
