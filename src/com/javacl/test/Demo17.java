package com.javacl.test;

import com.javacl.test.util.ListNode;

/**
 * 合并两个排序的链表
 * Created by caoliang on 2015/9/25.
 */
public class Demo17 {

    public static ListNode merge(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null) {
            return pHead2;
        }

        if (pHead2 == null) {
            return pHead1;
        }

        ListNode mergeHead = null;

        if (pHead1.data < pHead2.data) {
            mergeHead.data = pHead1.data;
            mergeHead.next = merge(pHead1.next, pHead2);
        } else {
            mergeHead.data = pHead2.data;
            mergeHead.next = merge(pHead1, pHead2.next);
        }

        return mergeHead;
    }

    public static void main(String[] args) {
        ListNode list1of1 = new ListNode();
        list1of1.data = 1;
        ListNode list1of2 = new ListNode();
        list1of1.data = 3;
        ListNode list2of1 = new ListNode();
        list2of1.data = 2;
        ListNode list2of2 = new ListNode();
        list2of2.data = 4;

        list1of1.next = list1of2;
        list2of1.next = list2of2;

        System.out.println(merge(list1of1, list2of1));
    }
}
