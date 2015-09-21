package com.javacl.test;

public class Demo3 {

	public static void main(String[] args) {
		int[][] a = {{1,2,8,9},
				{2,4,9,12},
				{4,7,10,13},
				{6,8,11,15}};
		System.out.println(find(a, 4, 4, 9));
	}
	
	public static boolean find (int[][] a, int rows, int columns, int number) {
		boolean found = false;
		if (a!=null && rows>0 && columns>0) {
			int row = 0;
			int column = columns - 1;
			while (row < rows && column >= 0) {
				if (a[row][column] == number) {
					found = true;
					break;
				} else if (a[row][column] > number) {
					column --;
				} else {
					row ++;
				}
			}
		}
		return found;
	}

}
