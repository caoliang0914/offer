package com.javacl.test;

/**
 * @author cl E-mail: caoliang0914@gmail.com
 * @version 0.1 create time：2016年4月5日 下午9:07:40
 * 题目：输入一个整型数组，数组里有正数也有负数，数组中一个或连续多个整数组成一个子数组。
 * 		求所有子数组和的最大值，要求时间复杂度为O(n)
 */
public class Demo31 {

	public static void main(String[] args) {
		int[] input = { 1, -2, 3, 10, -4, 7, 2, -5 };
		System.out.println(findGreatestSumOfSubArray(input, input.length));
	}

	public static int findGreatestSumOfSubArray(int[] input, int length) {
		if ((input == null) || (length < 0)) {
			return 0;
		}

		int curSum = 0;
		int greateSum = 0;

		for (int i = 0; i < length; i++) {
			if (curSum <= 0) {
				curSum = input[i];
			} else {
				curSum += input[i];
			}

			if (curSum > greateSum) {
				greateSum = curSum;
			}
		}

		return greateSum;
	}
}
