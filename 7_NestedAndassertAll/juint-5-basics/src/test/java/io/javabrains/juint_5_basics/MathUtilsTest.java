package io.javabrains.juint_5_basics;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;


@DisplayName("When running MathUtils")
class MathUtilsTest {

	MathUtils mathUtils;
	
	@BeforeEach
	void init() { //This method gets run before each method. So we get new instance of MathUtils class before each method.
		mathUtils = new MathUtils();
	}
	
	
	//When you want o group multiple tests you can use @Nested annotation
	@Nested
	@DisplayName("add method")
	class AddTest{
		
		@Test
		@DisplayName("When add two positive numbers")
		void testAddPositive() {
			assertEquals(3, mathUtils.add(1, 2), "Should return the right sum");
		}
		
		@Test
		@DisplayName("When add two negative numbers")
		void testAddNegative() {
			assertEquals(-2, mathUtils.add(-1, -1), "Should return the right sum");
		}
	}
	
	
	@Test
	@DisplayName("multiply method")
	void testMultiply() {
		//assertAll is use to run bunch of assert statements
		assertAll(
				()-> assertEquals(-2, mathUtils.multiply(2, -1)),
				() -> assertEquals(4, mathUtils.multiply(2, 2)),
				() -> assertEquals(0, mathUtils.multiply(2, 0))
				);
	}
	
}
