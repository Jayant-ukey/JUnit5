package io.javabrains.juint_5_basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd() {
		MathUtils mathUtils = new MathUtils();
		int expected = 2;
		int actual = mathUtils.add(1, 1);
//		assertEquals(expected, actual);
		assertEquals(expected, actual, "The add method should add 2 numbers");
	}

	@Test
	void computeCircleAreaTest() {
		MathUtils mathUtils = new MathUtils();
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "This method should return correct area of circle");
	}
	
}
