package com.javacl.test;

/**
 * 最小的k个数
 * @author caoliang  2015年10月23日 下午10:09:40
 */
public class Demo30 {

	public static int partition(int[]n ,int left,int right){  
        int pivotkey = n[left];  
        //枢轴选定后永远不变，最终在中间，前小后大  
        while (left < right) {  
            while (left < right && n[right] >= pivotkey) --right;  
            //将比枢轴小的元素移到低端，此时right位相当于空，等待低位比pivotkey大的数补上  
            n[left] = n[right];  
            while (left < right && n[left] <= pivotkey) ++left;  
            //将比枢轴大的元素移到高端，此时left位相当于空，等待高位比pivotkey小的数补上  
            n[right] = n[left];  
        }  
        //当left == right，完成一趟快速排序，此时left位相当于空，等待pivotkey补上  
        n[left] = pivotkey;  
        return left;  
    }  
	
	public static void getLeastNumber(int[] n, int length, int k) {
		if (n==null || length<=0 || k>length || k<=0 ) {
			return;
		}
		
		int start = 0;
		int end = length - 1;
		int index = partition(n, start, end);
		while (index != k-1) {
			if (index > k-1) {
				end = index - 1;
				index = partition(n, start, end);
			} else {
				start = index + 1;
				index = partition(n, start, end);
			}
		}
		
		for (int i = 0; i < k; i++) {
			System.out.print(n[i] + " ");
		}
	}
	
	public static void main(String[] args) {

		int[] n = {4, 5, 1, 6, 2, 7, 3, 8};
		getLeastNumber(n, n.length, 4);
	}

}
