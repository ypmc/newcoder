package leetcode;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author kangkang lou
 */

class MyStack {

    /**
     * Initialize your data structure here.
     */
    private Queue<Integer> first;
    private Queue<Integer> second;

    public MyStack() {
        first = new LinkedBlockingQueue<>();
        second = new LinkedBlockingQueue<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        first.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        int ret = 0;
        while (!first.isEmpty()) {
            ret = first.poll();
            second.add(ret);
        }
        while (!second.isEmpty()) {
            int temp = second.poll();
            if (temp != ret) {
                first.add(temp);
            }
        }
        return ret;
    }

    /**
     * Get the top element.
     */
    public int top() {
        int ret = 0;
        while (!first.isEmpty()) {
            ret = first.peek();
            second.add(first.poll());
        }
        while (!second.isEmpty()) {
            first.add(second.poll());
        }
        return ret;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return first.isEmpty();
    }
}

public class Main_225 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top());
        System.out.println(myStack.empty());
    }
}
