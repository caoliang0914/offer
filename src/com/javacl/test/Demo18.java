package com.javacl.test;

import com.javacl.test.util.BinaryTree;

/**
 * 树的子结构
 * Created by caoliang on 2015/9/27.
 */
public class Demo18 {

    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        tree1.root= 8;
        BinaryTree tree1left = new BinaryTree();
        tree1left.root = 9;
        BinaryTree tree2 = new BinaryTree();
        tree2.root= 8;
        BinaryTree tree2left = new BinaryTree();
        tree2left.root = 9;
        System.out.print(hasSubTree(tree1, tree2));
    }

    public static boolean hasSubTree (BinaryTree pRoot1, BinaryTree pRoot2) {
        boolean result = false;
        if (pRoot1.root == pRoot2.root) {
            result = doesTree1HaveTree2(pRoot1, pRoot2);
        }

        if (!result) {
            result = hasSubTree(pRoot1.left, pRoot2);
        }

        if (!result) {
            result = hasSubTree(pRoot1.right, pRoot2);
        }

        return result;
    }

    public static boolean doesTree1HaveTree2 (BinaryTree pRoot1, BinaryTree pRoot2) {
        if (pRoot2 == null) {
            return true;
        }

        if (pRoot1 == null) {
            return false;
        }

        if (pRoot1.root != pRoot2.root) {
            return false;
        }

        return doesTree1HaveTree2(pRoot1.left, pRoot2.left) && doesTree1HaveTree2(pRoot1.right, pRoot2.right);
    }
}
