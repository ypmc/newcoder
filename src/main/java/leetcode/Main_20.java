package leetcode;

import java.util.Stack;

/**
 * @author kangkang lou
 * 有效括号
 */
public class Main_20 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')') {
                if (stack.empty()) {
                    return false;
                } else if (stack.peek() != '(') {
                    return false;
                } else {
                    stack.pop();
                }
            } else if (c == ']') {
                if (stack.empty()) {
                    return false;
                } else if (stack.peek() != '[') {
                    return false;
                } else {
                    stack.pop();
                }
            } else if (c == '}') {
                if (stack.empty()) {
                    return false;
                } else if (stack.peek() != '{') {
                    return false;
                } else {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }

        return stack.empty() ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("["));
    }
}
