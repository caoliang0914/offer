package com.javacl.test;

import java.util.Stack;

/**
 * 包含min函数的栈
 * Created by caoliang on 2015/9/27.
 */
public class Demo21 {
    public static void main(String[] args) {
        Stack m_data = new Stack();
        Stack m_min = new Stack();
        push(m_data, m_min, 3);
        push(m_data, m_min, 4);
        push(m_data, m_min, 2);
        push(m_data, m_min, 1);
        pop(m_data, m_min);
        pop(m_data, m_min);
        push(m_data, m_min, 0);
        System.out.print(stackWithMin(m_data, m_min));
    }

    public static void push (Stack m_data, Stack m_min, int value){
        m_data.push(value);
        if (m_min.size() == 0 || value <  Integer.parseInt(m_min.peek().toString())) {
            m_min.push(value);
        } else {
            m_min.push(m_min.peek());
        }
    }

    public static void pop (Stack m_data, Stack m_min){
        if (m_data.size() > 0 && m_min.size() > 0) {
            m_data.pop();
            m_min.pop();
        }
    }

    public static int stackWithMin (Stack m_data, Stack m_min) {
        if (m_data.size()>0 && m_min.size() > 0) {
            return Integer.parseInt(m_min.peek().toString());
        } else {
            return -1000;
        }
    }
}
