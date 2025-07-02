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

    // 追加のテストケース：エッジケースと境界値テスト

    @Test
    public void testSumWithNegativeNumbers() {
        Calculate calculate = new Calculate();
        int expected = -1;
        assertEquals(expected, calculate.sum(-3, 2));
    }

    @Test
    public void testSumWithZero() {
        Calculate calculate = new Calculate();
        int expected = 5;
        assertEquals(expected, calculate.sum(0, 5));
    }

    @Test
    public void testAverageWithNegativeNumbers() {
        Calculate calculate = new Calculate();
        double expected = -0.5;
        assertEquals(expected, calculate.average(-3, 2), 0.001);
    }

    @Test
    public void testSumRangeWithSameNumbers() {
        Calculate calculate = new Calculate();
        int expected = 5;
        assertEquals(expected, calculate.sumRange(5, 5));
    }

    @Test
    public void testSumRangeWithSmallRange() {
        Calculate calculate = new Calculate();
        int expected = 3; // 1+2 = 3
        assertEquals(expected, calculate.sumRange(1, 2));
    }

    @Test
    public void testAverageRangeWithSameNumbers() {
        Calculate calculate = new Calculate();
        double expected = 5.0;
        assertEquals(expected, calculate.averageRange(5, 5), 0.001);
    }

    @Test
    public void testSumOddRangeWithEvenRange() {
        Calculate calculate = new Calculate();
        int expected = 16; // 1+3+5+7 = 16
        assertEquals(expected, calculate.sumOddRange(1, 7));
    }

    @Test
    public void testSumEvenRangeWithOddRange() {
        Calculate calculate = new Calculate();
        int expected = 12; // 2+4+6 = 12
        assertEquals(expected, calculate.sumEvenRange(1, 7));
    }

    @Test
    public void testSumOddRangeWithNoOdds() {
        Calculate calculate = new Calculate();
        int expected = 0;
        assertEquals(expected, calculate.sumOddRange(2, 2));
    }

    @Test
    public void testSumEvenRangeWithNoEvens() {
        Calculate calculate = new Calculate();
        int expected = 0;
        assertEquals(expected, calculate.sumEvenRange(1, 1));
    }

    @Test
    public void testSumRangeReversed() {
        Calculate calculate = new Calculate();
        // 範囲が逆転している場合のテスト（start > end）
        int expected = 0; // ループが実行されないため0になる
        assertEquals(expected, calculate.sumRange(10, 1));
    }

    @Test
    public void testAverageRangeReversed() {
        Calculate calculate = new Calculate();
        // 範囲が逆転している場合のテスト（start > end）
        // count = 1 - 10 + 1 = -8, sum = 0なので、0 / -8 = 0.0
        double expected = 0.0;
        assertEquals(expected, calculate.averageRange(10, 1), 0.001);
    }

    @Test
    public void testOddRangeReversed() {
        Calculate calculate = new Calculate();
        int expected = 0;
        assertEquals(expected, calculate.sumOddRange(10, 1));
    }

    @Test
    public void testEvenRangeReversed() {
        Calculate calculate = new Calculate();
        int expected = 0;
        assertEquals(expected, calculate.sumEvenRange(10, 1));
    }
}