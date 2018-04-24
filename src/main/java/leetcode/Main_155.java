package leetcode;

import java.util.Stack;

/**
 * @author kangkang lou
 */
class MinStack {

    Stack<Integer> stack = new Stack<>();
    int min;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if (x < min) {
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        int t = stack.pop();
        if (t == min) {
            min = Integer.MAX_VALUE;
            Stack<Integer> s = new Stack<>();
            while (!stack.isEmpty()) {
                int temp = stack.pop();
                if (temp < min) {
                    min = temp;
                }
                s.push(temp);
            }
            while (!s.isEmpty()) {
                stack.push(s.pop());
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}

public class Main_155 {

    public static void main(String[] args) {

    }
}
