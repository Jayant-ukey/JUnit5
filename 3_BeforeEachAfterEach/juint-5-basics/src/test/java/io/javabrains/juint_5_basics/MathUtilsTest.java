package io.javabrains.juint_5_basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

	MathUtils mathUtils;

	@BeforeEach
	void init() { //This method gets run before each method. So we get new instance of MathUtils class before each method.
		mathUtils = new MathUtils();
	}
	
	@Test
	void testAdd() {
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		//		assertEquals(expected, actual);
		assertEquals(expected, actual, "The add method should add 2 numbers");
	}

	@Test
	void testComputeCircleAreaTest() {
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "This method should return correct area of circle");
	}
	
	
	//Imp assertThrows
	@Test
	void testDivide() {
		//		assertThrows(NullPointerException.class, ()-> mathUtils.divide(1, 0), "Divide by zero should throw ArithmeticException"); //fails
		assertThrows(ArithmeticException.class, ()-> mathUtils.divide(1, 0), "Divide by zero should throw ArithmeticException");
	}
	
	@AfterEach
	void cleanup() {
		System.out.println("Cleaning up...");
	}
	
}
