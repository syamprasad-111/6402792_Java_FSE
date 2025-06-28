package com.AssertionTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAssertions {

	@Test
	void test() {
		       // Assert Equals
				assertEquals(9,6+3);
				// Assert array Equals
				int[] arr1 = {6, 7, 9};
				int[] arr2 = {6, 7, 9};
				assertArrayEquals(arr1,arr2);  // checks the size, contents and order of element in both arrays
				// Assert true
				assertTrue(6 > 3);  // Test case will pass if condition is true
				// Assert False
				assertFalse(6 < 3);  // Test case will pass if condition is false
				// Assert Not Null
				assertNotNull(new Object()); // Test Case will pass if object inside is not null
				// Assert Null
				assertNull(null); // Test Case will pass if object inside is null
				
	}

}
