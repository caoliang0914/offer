package com.javacl.test;

import com.javacl.test.util.ListNode;

/**
 * 链表中倒数第k个结点
 * Created by caoliang on 2015/9/24.
 */
public class Demo15 {

    public static ListNode findKthToTail(ListNode headNode, int k) {

        if (headNode == null || k == 0) {
            return null;
        }

        ListNode pAhead = headNode;
        ListNode pBehind = null;

        for (int i=0; i<k-1; i++) {
            if (pAhead.next != null) {
                pAhead = pAhead.next;
            } else {
                return null;
            }
        }

        pBehind = headNode;
        while (pAhead.next != null) {
            pAhead = pAhead.next;
            pBehind = pBehind.next;
        }

        return pBehind;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode();
        one.data = 1;
        ListNode two = new ListNode();
        two.data = 2;
        ListNode three = new ListNode();
        three.data = 3;
        ListNode four = new ListNode();
        four.data = 4;
        ListNode five = new ListNode();
        five.data = 5;
        ListNode six = new ListNode();
        six.data = 6;
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        System.out.println(findKthToTail(one, 3).data);
    }
}
