package leetcode;

import java.util.Stack;

/**
 * @author kangkang lou
 */
public class Main_150 {

    public int evalRPN(String[] tokens) {
        if (tokens.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if (isValid(s)) {
                int a = stack.pop();
                int b = stack.pop();
                int c = compute(a, b, s);
                stack.push(c);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

    boolean isValid(String s) {
        return "+".equals(s) || "-".equals(s) || "*".equals(s) || "/".equals(s);
    }

    int compute(int a, int b, String s) {
        if ("+".equals(s)) {
            return a + b;
        } else if ("-".equals(s)) {
            return b - a;
        } else if ("*".equals(s)) {
            return a * b;
        } else {
            return b / a;
        }
    }

    public static void main(String[] args) {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(new Main_150().evalRPN(tokens));
    }
}
