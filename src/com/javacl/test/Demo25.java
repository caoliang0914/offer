package com.javacl.test;

import com.javacl.test.util.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树中和为某一值的路径
 * Created by caoliang on 2015/9/30.
 */
public class Demo25 {

    public static void main(String[] args) {
        BinaryTree one = new BinaryTree();
        one.root = 10;
        BinaryTree two = new BinaryTree();
        two.root = 5;
        BinaryTree three = new BinaryTree();
        three.root = 4;
        BinaryTree four = new BinaryTree();
        four.root = 7;
        BinaryTree five = new BinaryTree();
        five.root = 12;
        one.left = two;
        one.right = five;
        two.left = three;
        two.right = four;
        findPath(one, 22);
    }

    public static void findPath (BinaryTree pRoot, int expectedSum) {
        if (pRoot == null) {
            return;
        }

        Stack<Integer> path = new Stack<Integer>();
        int currentSum = 0;
        findPath(pRoot, expectedSum, path, currentSum);
    }

    public static void findPath(BinaryTree pRoot, int expectedSum, Stack<Integer> path, int currentSum) {
        currentSum += pRoot.root;
        path.push(pRoot.root);

        //如果是叶结点，并且路径上的和等于输入的值
        //打印出这条路径
        boolean isleaf = (pRoot.left == null) && (pRoot.right == null);
        if (currentSum == expectedSum && isleaf) {
            for (Integer i : path) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }

        //如果不是叶结点，则遍历它的子结点
        if (pRoot.left != null) {
            findPath(pRoot.left, expectedSum, path, currentSum);
        }

        if (pRoot.right != null) {
            findPath(pRoot.right, expectedSum, path, currentSum);
        }

        path.pop();
    }
}
