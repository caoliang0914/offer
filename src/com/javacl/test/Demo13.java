package com.javacl.test;

import com.javacl.test.util.ListNode;

/**
 * 在O(1)时间内删除链表节点
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
            System.out.print("删除成功");
        }
    }

    public static void deleteNode (ListNode headNode, ListNode deleteNode) {
        //要删除的节点不是尾结点
        if(deleteNode.next != null) {
            deleteNode.data = deleteNode.next.data;
            if (deleteNode.next.next == null) { //要删除节点的右边第二个节点为空
                deleteNode.next = null;
            } else {
                deleteNode.next = deleteNode.next.next;
            }
        } else if(headNode.equals(deleteNode)) { //只有一个结点
            headNode = null;
            deleteNode = null;
        } else { //表中有多个结点，删除尾结点，需要遍历所有结点
            ListNode node = headNode;
            while (!node.next.equals(deleteNode)) {
                node = node.next;
            }
            node.next = null;
        }
    }
}

