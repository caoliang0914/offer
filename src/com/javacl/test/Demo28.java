package com.javacl.test;

/**
 * @author cl E-mail: caoliang0914@gmail.com 
 * @version 0.1 create time：2016年4月5日 下午8:13:32 
 * 字符串排列
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
