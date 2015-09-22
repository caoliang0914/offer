package com.javacl.test;


/**
 * 斐波那契数列非递归解法
 * Created by caoliang on 2015/9/22.
 */
public class demo9 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        int[] result = {0, 1};
        if (n < 2) {
            return result[n];
        }

        int fibNminusOne = 1;
        int fibNminusTwo = 0;
        int fibN = 0;
        for (int i=2; i<=n; i++) {
            fibN = fibNminusOne + fibNminusTwo;
            fibNminusTwo = fibNminusOne;
            fibNminusOne = fibN;
        }
        return fibN;
    }
}
