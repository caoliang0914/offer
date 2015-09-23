package com.javacl.test;

import javax.xml.stream.events.EndDocument;

/**
 * 调整数组顺序使奇数位于偶数前面
 * Created by caoliang on 2015/9/23.
 */
public class Demo14 {

    public static void main(String[] args) {
        int[] pData = {1, 2, 3, 4, 5};
        reorderOddEven(pData);
        for (int i=0; i< pData.length; i++) {
            System.out.print(pData[i] + " ");
        }
    }

    public static void reorderOddEven(int[] pData) {
        if (pData == null || pData.length == 0) {
            System.out.println("数组不能为空");
            return;
        }

        int pBegin = 0;
        int pEnd = pData.length - 1;

        while ((pBegin < pEnd) && ((pData[pBegin]%2)!=0)) {
            pBegin++;
        }

        while ((pBegin < pEnd) && ((pData[pEnd]%2)==0)) {
            pEnd--;
        }

        if (pBegin<pEnd) {
            int temp = pData[pBegin];
            pData[pBegin] = pData[pEnd];
            pData[pEnd] = temp;
        }
    }
}

