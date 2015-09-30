package com.javacl.test;

import com.javacl.test.util.ComplexListNode;

/**
 * 复杂链表的复制
 * Created by caoliang on 2015/9/30.
 */
public class Demo26 {

    public static void main(String[] args) {
        ComplexListNode one = new ComplexListNode();
        one.m_nValue = 1;
        ComplexListNode two = new ComplexListNode();
        two.m_nValue = 2;
        ComplexListNode three = new ComplexListNode();
        three.m_nValue = 3;
        ComplexListNode four = new ComplexListNode();
        four.m_nValue = 4;
        ComplexListNode five = new ComplexListNode();
        five.m_nValue = 5;
        one.m_pNext = two;
        two.m_pNext = three;
        three.m_pNext = four;
        four.m_pNext = five;
        one.m_pSibling = three;
        two.m_pSibling = five;
        four.m_pSibling = two;
        System.out.print(clone(one).m_nValue);
    }

    public static ComplexListNode clone (ComplexListNode pHead) {
        cloneNodes(pHead);
        connectSiblingNodes(pHead);
        return reconnectNodes(pHead);
    }

    /**
     * 复制链表结点
     * @param pHead
     */
    public static void cloneNodes (ComplexListNode pHead) {
        ComplexListNode pNode = pHead;
        while (pNode != null) {
            ComplexListNode pCloned = new ComplexListNode();
            pCloned.m_nValue = pNode.m_nValue;
            pCloned.m_pNext = pNode.m_pNext;
            pCloned.m_pSibling = null;

            pNode.m_pNext = pCloned;

            pNode = pCloned.m_pNext;
        }
    }

    public static void connectSiblingNodes (ComplexListNode pHead) {
        ComplexListNode pNode = pHead;
        while (pNode != null) {
            ComplexListNode pCloned = pNode.m_pNext;
            if (pNode.m_pSibling != null) {
                pCloned.m_pSibling = pNode.m_pSibling.m_pNext;
            }
            pNode = pCloned.m_pNext;
        }
    }

    public static ComplexListNode reconnectNodes (ComplexListNode pHead) {
        ComplexListNode pNode = pHead;
        ComplexListNode pCloneHead = null;
        ComplexListNode pClonedNode = null;
        if (pNode != null) {
            pCloneHead = pClonedNode = pNode.m_pNext;
            pNode.m_pNext = pClonedNode.m_pNext;
            pNode = pNode.m_pNext;
        }

        while (pNode != null) {
            pClonedNode.m_pNext = pNode.m_pNext;
            pClonedNode = pClonedNode.m_pNext;
            pNode.m_pNext = pClonedNode.m_pNext;
            pNode = pNode.m_pNext;
        }

        return pCloneHead;
    }
}
