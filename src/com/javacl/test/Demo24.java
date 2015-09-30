package com.javacl.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 二叉搜索树的后序遍历序列
 * Created by caoliang on 2015/9/27.
 */
public class Demo24 {

    public static boolean vertifySquenceOfbST (int[] sequence, int length) {
        if (sequence == null || length < 0) {
            return false;
        }

        //在二叉搜索树中左子树的结点小于根结点
        int i = 0;
        for (; i<length; i++) {
            if (sequence[i] > sequence[length-1]) {
                break;
            }
        }

        //在二叉搜索树中左子树的结点小于根结点
        int j = i;
        for (; j<length; j++) {
            if (sequence[j] < sequence[length-1]) {
                return false;
            }
        }

        //判断左子树是不是二叉搜索树
        boolean left = false;
        if (i>0) {
            left = vertifySquenceOfbST(Arrays.copyOfRange(sequence, 0, i), i);
        }

        //判断右子树是不是二叉搜索树
        boolean right = false;
        if (i<length-1) {
            right = vertifySquenceOfbST(Arrays.copyOfRange(sequence, i, length), length-i-1)
        }

        return (left&&right);
    }

    public static void main(String[] args) {
        int m[] = {5, 7, 6, 9, 11, 10, 8};
        System.out.println(vertifySquenceOfbST(m, m.length));
    }
}
