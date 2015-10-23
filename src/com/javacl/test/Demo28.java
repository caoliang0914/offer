package com.javacl.test;

/**
 * 
 * 字符串的排列
 * 
 * @author 一粟 2015年10月23日 下午3:13:55
 */
public class Demo28 {

	public static void main(String[] args) {
		char[] pSttr = {'a', 'b', 'c'};
		permutation(pSttr);
	}

	public static void permutation(char[] pStr) {
		if (pStr == null) {
			return;
		}

		permutation(pStr, 0);
	}

	private static void permutation(char[] pStr, int pBegin) {
		if (pBegin == pStr.length) {
			System.out.println(pStr);
		} else {
			for (int i = pBegin; i < pStr.length; i++) {
				char temp = pStr[pBegin];
				pStr[pBegin] = pStr[i];
				pStr[i] = temp;

				permutation(pStr, pBegin+1);

				temp = pStr[pBegin];
				pStr[pBegin] = pStr[i];
				pStr[i] = temp;
			}
		}
	}

}
