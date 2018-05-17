package leetcode;

import java.util.Stack;

/**
 * @author kangkang lou
 */
class MyQueue {

    private Stack<Integer> first;
    private Stack<Integer> second;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        first.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int ret = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return ret;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int ret = second.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return ret;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return first.isEmpty();
    }
}

public class Main_232 {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println(queue.empty());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.empty());
    }
}
