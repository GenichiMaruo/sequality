package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void testSum() {
        Calculate calculate = new Calculate();
        int expected = 5;
        assertEquals(expected, calculate.sum(2, 3));
    }

    @Test
    public void testAverage() {
        Calculate calculate = new Calculate();
        double expected = 2.5;
        assertEquals(expected, calculate.average(2, 3), 0.001);
    }

    @Test
    public void testSumRange() {
        Calculate calculate = new Calculate();
        int expected = 55;
        assertEquals(expected, calculate.sumRange(1, 10));
    }

    @Test
    public void testAverageRange() {
        Calculate calculate = new Calculate();
        double expected = 5.5;
        assertEquals(expected, calculate.averageRange(1, 10), 0.001);
    }

    @Test
    public void testSumOddRange() {
        Calculate calculate = new Calculate();
        int expected = 25; // 1+3+5+7+9 = 25
        assertEquals(expected, calculate.sumOddRange(1, 10));
    }

    @Test
    public void testSumEvenRange() {
        Calculate calculate = new Calculate();
        int expected = 30; // 2+4+6+8+10 = 30
        assertEquals(expected, calculate.sumEvenRange(1, 10));
    }
}