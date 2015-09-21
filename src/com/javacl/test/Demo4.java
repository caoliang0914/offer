package com.javacl.test;

/**
 * 替换字符串中的空格
 */
public class Demo4 {

	public static void main(String[] args) {
		String s = "we are happy";
		printArray(replaceAllBlank(s));
	}

	//原字符串中的空格数量
	public static int blankCount (String testStr) {
		int count = 0;
		for (int i = 0; i < testStr.length(); i++) {
			if (testStr.charAt(i) == ' ') {
				count++ ;
			}
		}
		return count;
	}
	
	//打印字节数组
	public static void printArray(char[] strArray) {
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]);
		}
	}
	
	public static char[] replaceAllBlank (String testStr) {
		System.out.println("原字符串：" + testStr);
		int indexofold = testStr.length() - 1;
		int count = blankCount(testStr);
		int newlength = testStr.length() + count * 2;
		int indexofnew = newlength - 1;
		
		char[] testArray = new char[newlength];
		
		System.arraycopy(testStr.toCharArray(), 0, testArray, 0, testStr.toCharArray().length);
		
		printArray(testArray);
		
		while (indexofold > 0 && indexofnew > indexofold) {
			if (testArray[indexofold] == ' ') {
				testArray[indexofnew--] = '%';
				testArray[indexofnew--] = '2';
				testArray[indexofnew--] = '0';
			} else {
				testArray[indexofnew--] = testArray[indexofold];
			}
			indexofold--;
		}
		return testArray;
	}
}
