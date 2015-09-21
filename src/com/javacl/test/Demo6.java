package com.javacl.test;

import com.javacl.test.util.BinaryTree;

import java.util.Arrays;

/**
 * ��֪��������ǰ������Լ�����������ؽ�������
 * Created by caoliang on 2015/9/21.
 */
public class Demo6 {
    public static void main(String[] args) {
        int[] preorder = {1, 2, 4, 7, 3, 5, 6, 8}; //ǰ�����
        int[] inorder = {4, 7, 2, 1, 5, 3, 8, 6}; //�������

        System.out.println(ConstructCore(preorder, inorder).root);
    }

    /**
     * �ؽ�������
     * @param preorder
     * @param inorder
     * @return
     */
    public static BinaryTree ConstructCore(int[] preorder, int[] inorder) {
        BinaryTree binaryTree = new BinaryTree();

        if (preorder == null || inorder == null) {
            System.out.println("�����������ǰ���������Ϊ�գ�");
            return null;
        }

        if (preorder.length != inorder.length) {
            System.out.println("���������ǰ��������Ȳ�ͬ��");
            return null;
        }

        for(int i=0; i<inorder.length; i++) {
            int root = preorder[0]; //ǰ������ĵ�һ���ڵ㼴Ϊ���ڵ�
            if (inorder[i] == root) {
                binaryTree.root = root;
                binaryTree.left = ConstructCore(Arrays.copyOfRange(preorder, 1, i+1), Arrays.copyOfRange(inorder, 0, i));
                binaryTree.right = ConstructCore(Arrays.copyOfRange(preorder, i+1, preorder.length), Arrays.copyOfRange(inorder, i+1, inorder.length));
            }
        }
        return binaryTree;
    }
}
