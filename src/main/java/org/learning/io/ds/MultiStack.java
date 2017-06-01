package org.learning.io.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by wz on 5/9/17.
 */
public class MultiStack<T> extends Stack<T> {
    List<Stack<T>> stacks;
    private Integer MAX = 10;
    private Integer currentSize;
    private Integer currentStack;

    public MultiStack() {
        stacks = new ArrayList<>();
        stacks.add(new Stack<T>());
        currentSize = 0;
        currentStack = 0;
    }

    @Override
    public T push(T item) {
        if (currentSize == MAX) {
            stacks.add(new Stack<T>());
            currentStack++;
            currentSize = 0;
        }
        currentSize++;
        return stacks.get(currentStack).push(item);
    }

    @Override
    public synchronized T pop() {
        T item = stacks.get(currentStack).pop();
        if (stacks.get(currentStack).isEmpty()) {
            stacks.remove(currentStack);
            currentStack--;
            currentSize = MAX;
        }
        return item;
    }

    public T popAt(Integer index) {
        if (stacks.get(index) == null) {
            throw new RuntimeException("No stack available");
        }

        return stacks.get(index).pop();
    }
}
