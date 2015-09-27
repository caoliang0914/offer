package com.javacl.test;

import com.javacl.test.util.BinaryTree;

/**
 * 二叉树的镜像
 * Created by caoliang on 2015/9/27.
 */
public class Demo19 {

    public static void mirrorRecursively (BinaryTree pNode) {
        if (pNode == null) {
            return;
        }

        if (pNode.left == null && pNode.right == null) {
            return;
        }

        BinaryTree pTemp = pNode.left;
        pNode.left = pNode.right;
        pNode.right = pTemp;

        if (pNode.left != null) {
            mirrorRecursively(pNode.left);
        }

        if (pNode.right != null) {
            mirrorRecursively(pNode.right);
        }
    }
}
