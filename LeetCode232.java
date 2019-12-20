package LeetCode;

import java.util.Stack;

class LeetCode232 {

    Stack<Integer> stack;
    public LeetCode232() {
        stack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int value = stack.get(0);
        stack.remove(0);
        return value;
    }

    /** Get the front element. */
    public int peek() {
        return stack.get(0);
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.empty();
    }
}

