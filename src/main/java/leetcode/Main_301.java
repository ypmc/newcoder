package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author kangkang lou
 */
public class Main_301 {
    public List<String> removeInvalidParentheses(String s) {
        List<String> list = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        List<Character> l = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    char t = stack.pop();
                    if (t == '(') {
                        l.add(t);
                        l.add(c);
                    }
                }
            }
        }
        System.out.println("l = "+l);
        stack.clear();
        List<Character> b = new ArrayList<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == ')') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    char t = stack.pop();
                    if (t == '(') {
                        b.add(t);
                        b.add(c);
                    }
                }
            }
        }
        System.out.println("b = "+b);
        return null;
    }

    public static void main(String[] args) {
        String s = "()())()";
        new Main_301().removeInvalidParentheses(s);
        String temp = s.replace('(', '#').replace(')', '(').replace('#', ')');
        String t = new StringBuilder(temp).reverse().toString();
        new Main_301().removeInvalidParentheses(t);
    }
}
