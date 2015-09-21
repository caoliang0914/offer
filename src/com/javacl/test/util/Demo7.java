package com.javacl.test.util;

import java.util.Stack;

/**
 * 两个栈实现队列
 * Created by caoliang on 2015/9/21.
 */
public class Demo7 {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        appendTail(stack1, new Integer(1));
        System.out.println("删除对首元素为：" + deleteHead(stack1, stack2));
    }

    //向队尾添加元素
    public static void appendTail(Stack stack, Integer n) {
        stack.push(n);
    }

    //删除对首元素
    public static int deleteHead(Stack stack1, Stack stack2) {
        if (stack2.size() <=0 ) {
            while (stack1.size() > 0) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.size() == 0) {
            System.out.print("队列内没有元素");
            return -1;
        }
        int head = Integer.parseInt(stack2.pop().toString());
        return head;
    }
}
