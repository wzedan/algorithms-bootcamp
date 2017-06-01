package org.learning.io;

import org.junit.Assert;
import org.junit.Test;
import org.learning.io.ds.MultiStack;
import org.learning.io.ds.MyStack;

import static org.junit.Assert.assertEquals;

/**
 * Created by wz on 5/9/17.
 */
public class MyStackTests {

    @Test
    public void testMin() {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(23);
        stack.push(9);

        assertEquals(new Integer(1), stack.min());
    }

    @Test
    public void testMultiStack() {
        MultiStack<Integer> stack = new MultiStack<>();
        for (int i = 1; i <= 25; i++) {
            stack.push(i);
        }

        assertEquals(new Integer(25), stack.pop());

        assertEquals(new Integer(20), stack.popAt(1));
    }
}
