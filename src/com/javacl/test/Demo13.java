package com.javacl.test;

import com.javacl.test.util.ListNode;

/**
 * ��O(1)ʱ����ɾ������ڵ�
 * Created by caoliang on 2015/9/23.
 */
public class Demo13 {

    public static void main(String[] args) {
        ListNode headNode = new ListNode();
        headNode.data = 1;
        ListNode secondNode = new ListNode();
        secondNode.data = 2;
        ListNode threeNode = new ListNode();
        threeNode.data = 3;
        headNode.next = secondNode;
        secondNode.next = threeNode;
        deleteNode(headNode, threeNode);
        if (secondNode.next == null) {
            System.out.print("ɾ���ɹ�");
        }
    }

    public static void deleteNode (ListNode headNode, ListNode deleteNode) {
        //Ҫɾ���Ľڵ㲻��β���
        if(deleteNode.next != null) {
            deleteNode.data = deleteNode.next.data;
            if (deleteNode.next.next == null) { //Ҫɾ���ڵ���ұߵڶ����ڵ�Ϊ��
                deleteNode.next = null;
            } else {
                deleteNode.next = deleteNode.next.next;
            }
        } else if(headNode.equals(deleteNode)) { //ֻ��һ�����
            headNode = null;
            deleteNode = null;
        } else { //�����ж����㣬ɾ��β��㣬��Ҫ�������н��
            ListNode node = headNode;
            while (!node.next.equals(deleteNode)) {
                node = node.next;
            }
            node.next = null;
        }
    }
}

