package com.javacl.test;

import java.util.Comparator;

/**
 * @author cl E-mail: caoliang0914@gmail.com
 * @version 0.1 create time：2016年4月5日 下午9:48:57
 *          题目：输入一个正整数数组，把数组里的所有数字拼接起来，拼接成一个数，打印能拼接出的所有数字中最小的一个。例如输入{3，32，321}，
 *          则打印出这3个数字能排成的最小数字321323
 */
public class Demo33 {

	private static class Compare implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			if (o1 == null || o2 == null) {
				throw new IllegalArgumentException("Args should not null");
			}
			String s1 = o1 + o2;
			String s2 = o2 + o1;
			return s1.compareTo(s2);
		}
	}

	/**
	 * 快排算法
	 * @param array
	 * @param start
	 * @param end
	 * @param comparator 字符串比较接口
	 */
	public static void quickSort(String[] array, int start, int end, Comparator<String> comparator) {
		if (start < end) {
			String pivot = array[start];
			int left = start;
			int right = end;
			while (start < end) {
				while (start < end && comparator.compare(array[end], pivot) >= 0) {
					end--;
				}
				array[start] = array[end];
				while (start < end && comparator.compare(array[start], pivot) <= 0) {
					start++;
				}
				array[end] = array[start];
			}
			array[start] = pivot;
			quickSort(array, left, start - 1, comparator);
			quickSort(array, start + 1, right, comparator);
		}
	}
	
	public static String printMinNumber(String[] array) {
		if (array == null || array.length <= 0) {
			throw new IllegalArgumentException("array can not null");
		}
		quickSort(array, 0, array.length-1, new Compare());
		StringBuffer sb = new StringBuffer();
		for (String s : array) {
			sb.append(s);
		}
		return sb.toString();
		
	} 

	public static void main(String[] args) {
		String[] array = {"3", "32", "321"};
		System.out.println(printMinNumber(array));
	}

}
