package org.learning.io.ds;

import java.util.Stack;

/**
 * Created by wz on 5/9/17.
 */
public class MyStack extends Stack<Integer> {

    Stack<Integer> stack;

    public MyStack() {
        this.stack = new Stack<Integer>();
    }

    @Override
    public Integer push(Integer item) {
        if (item < min()) {
            stack.push(item);
        }
        return super.push(item);
    }

    @Override
    public synchronized Integer pop() {
        Integer value = super.pop();
        if (value == min()) {
            stack.pop();
        }
        return value;
    }


    public Integer min() {
        if (stack.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return stack.peek();
        }
    }
}
