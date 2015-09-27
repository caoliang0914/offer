package com.javacl.test;

import com.javacl.test.util.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上往下打印二叉树
 * Created by caoliang on 2015/9/27.
 */
public class Demo23 {

    public static void printFromTopToBottom (BinaryTree tree) {

        if (tree == null) {
            return;
        }

        LinkedList dequeTreeNode = new LinkedList();

        dequeTreeNode.addLast(tree);

        while (dequeTreeNode.size() > 0) {
            BinaryTree pNode = (BinaryTree)dequeTreeNode.poll();
            System.out.print(pNode.root + " ");

            if (pNode.left != null) {
               dequeTreeNode.addLast(pNode.left);
            }

            if (pNode.right != null) {
                dequeTreeNode.addLast(pNode.right);
            }
        }

    }

    public static void main(String[] args) {
        BinaryTree one = new BinaryTree();
        one.root = 8;
        BinaryTree two = new BinaryTree();
        two.root = 6;
        BinaryTree three = new BinaryTree();
        three.root = 10;
        BinaryTree four = new BinaryTree();
        four.root = 5;
        BinaryTree five = new BinaryTree();
        five.root = 9;
        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
        printFromTopToBottom(one);
    }
}
