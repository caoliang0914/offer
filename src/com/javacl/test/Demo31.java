package com.javacl.test;

/**
 * 连续子数组的最大和
 * @author caoliang  2015年10月24日 下午6:55:18
 */
public class Demo31 {

	public static void main(String[] args) {
		int[] input = {1, -2, 3, 10, -4, 7, 2, -5};
		System.out.println(findGreatestSumOfSubArray(input, input.length));
	}

	public static int findGreatestSumOfSubArray(int[] input, int length) {
		if ((input==null) || (length<0)) {
			return 0;
		}
		
		int curSum = 0;
		int greateSum = 0;
		
		for(int i=0; i<length; i++) {
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
