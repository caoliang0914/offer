package com.javacl.test;


/**
 * 数组中出现次数超过一半的数字
 * @author caoliang  2015年10月23日 下午7:57:30
 */
public class Demo29 {

	static boolean q_bInputInvalid = false;
	
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 2, 2, 2, 5, 4, 2};
		int length = numbers.length;
		int result = moreThanHalfNum(numbers, length);
		System.out.println(result);
	}

	public static boolean  checkInvalidArray(int[] numbers, int length) {
		q_bInputInvalid = false;
		if (numbers == null && length <=0) {
			q_bInputInvalid = true;
		}
		return q_bInputInvalid;
	}
	
	public static boolean checkMoreThanHalf(int[] numbers, int length, int number) {
		int times = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == number) {
				times++;
			}
		}
		boolean isMoreHalf = true;
		if (times*2 <= length) {
			q_bInputInvalid = true;
			isMoreHalf = false;
		}
		return isMoreHalf;
	}
	
	public static int moreThanHalfNum(int[] numbers, int length) {
		if(checkInvalidArray(numbers, length)) {
			return 0;
		}
		
		int result = numbers[0];
		int times = 1;
		for (int i = 0; i < numbers.length; i++) {
			if (times == 0) {
				result = numbers[i];
				times = 1;
			} else if (result == numbers[i]) {
				times++;
			} else {
				times--;
			}
		}
		
		if (!checkMoreThanHalf(numbers, length, result)) {
			return 0;
		}
		return result;
	}
	
}
