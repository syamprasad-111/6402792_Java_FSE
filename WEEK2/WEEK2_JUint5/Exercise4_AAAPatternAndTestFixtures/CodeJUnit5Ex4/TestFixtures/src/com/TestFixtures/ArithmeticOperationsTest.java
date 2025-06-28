package com.TestFixtures;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
 
class ArithmeticOperationsTest {

	static ArithmeticOperations opr;

    // Setup() - runs before each test
    @BeforeAll
    public static void setUp() {
        opr = new ArithmeticOperations();
        System.out.println("Setup Completed");
    }

    // Teardown() - runs after each test
    @AfterAll
    public static void tearDown() {
        opr = null;
        System.out.println("Teardown Completed");
    }

    @Test
    public void testAddition() {
        // Arrange
        int a=5,b=4; 
        // Act
        int res = opr.addition(a,b);
        // Assert
        assertEquals(9,res);
    }

    @Test
    public void testDivision() {
        // Arrange
        int a = 81, b = 9;
        // Act
        int res = opr.division(a, b);
        // Assert
        assertEquals(9, res);
    }

    @Test
    public void testDividedByZero() {
        // Arrange
        int a = 9, b = 0;
        // Act and Assert
        Exception e = assertThrows(IllegalArgumentException.class, () -> opr.division(a,b));
        assertEquals("Cannot divide by zero", e.getMessage());
    }

}
