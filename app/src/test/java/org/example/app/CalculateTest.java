package org.example.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateTest {
    @Test
    public void testSum() {
        Calculate calculate = new Calculate();
        int expected = 5;
        assertEquals(expected, calculate.sum(2, 3));
    }

    @Test
    public void testAdd() {
        Calculate calculate = new Calculate();
        int expected = 5;
        assertEquals(expected, calculate.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculate calculate = new Calculate();
        int expected = -1;
        assertEquals(expected, calculate.subtract(2, 3));
    }

    @Test
    public void testMultiply() {
        Calculate calculate = new Calculate();
        int expected = 6;
        assertEquals(expected, calculate.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        Calculate calculate = new Calculate();
        double expected = 2.0;
        assertEquals(expected, calculate.divide(6, 3), 0.001);
    }

    @Test
    public void testAppReternHelloWorld() {
        App classUnderTest = new App();
        assertEquals("Hello World!", classUnderTest.getGreeting());
    }
}
