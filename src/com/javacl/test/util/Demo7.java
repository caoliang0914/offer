package com.javacl.test.util;

import java.util.Stack;

/**
 * ����ջʵ�ֶ���
 * Created by caoliang on 2015/9/21.
 */
public class Demo7 {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        appendTail(stack1, new Integer(1));
        System.out.println("ɾ������Ԫ��Ϊ��" + deleteHead(stack1, stack2));
    }

    //���β���Ԫ��
    public static void appendTail(Stack stack, Integer n) {
        stack.push(n);
    }

    //ɾ������Ԫ��
    public static int deleteHead(Stack stack1, Stack stack2) {
        if (stack2.size() <=0 ) {
            while (stack1.size() > 0) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.size() == 0) {
            System.out.print("������û��Ԫ��");
            return -1;
        }
        int head = Integer.parseInt(stack2.pop().toString());
        return head;
    }
}
