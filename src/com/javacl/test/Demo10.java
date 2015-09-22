package com.javacl.test;

/**
 * 二进制中1的个数
 * Created by caoliang on 2015/9/22.
 */
public class Demo10 {
    public static void main(String[] args) {
        System.out.println("9的二进制包含1的个数为：" + numberOf1(9));
    }

    public static int numberOf1 (int n) {
       int count = 0;
       while (n !=0) {
           count++;
           n = n & (n-1);
       }
        return count;
    }
}

