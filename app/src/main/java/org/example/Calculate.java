package org.example;

public class Calculate {
    public int sum(int x, int y) {
        return x + y;
    }

    // 平均値を計算するメソッド
    public double average(int x, int y) {
        return (double) (x + y) / 2;
    }

    // 2つの数とその間の数の合計を求めるメソッド
    public int sumRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    // 範囲の平均値を計算するメソッド
    public double averageRange(int start, int end) {
        int sum = sumRange(start, end);
        int count = end - start + 1;
        return (double) sum / count;
    }

    // 2つの数とその間の奇数の合計を求めるメソッド
    public int sumOddRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }

    // 2つの数とその間の偶数の合計を求めるメソッド
    public int sumEvenRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}