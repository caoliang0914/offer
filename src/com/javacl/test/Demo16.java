package com.javacl.test;

import com.javacl.test.util.ListNode;

/**
 * ·´×ªÁ´±í
 * Created by caoliang on 2015/9/25.
 */
public class Demo16 {

    public static ListNode reverseList(ListNode pHead) {
        ListNode pReverseHead = null;
        ListNode pNode = pHead;
        ListNode pPrev = null;

        while (pNode != null) {
            ListNode pNext = pNode.next;

            if (pNext == null) {
                pReverseHead = pNode;
            }

            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
         }

        return pReverseHead;
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
        System.out.println(reverseList(one).data);
    }

}
