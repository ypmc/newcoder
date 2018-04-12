package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangkang lou
 */
public class Main_22 {

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtracking(res, new StringBuilder(), 0, 0, n);
        return res;
    }

    private static void backtracking(List<String> res, StringBuilder sb, int open, int close, int n) {
        if (open == n && close == n) {
            res.add(sb.toString());
            return;
        }

        if (open < n) {
            sb.append("(");
            backtracking(res, sb, open + 1, close, n);
            sb.setLength(sb.length() - 1);
        }
        if (close < open) {
            sb.append(")");
            backtracking(res, sb, open, close + 1, n);
            sb.setLength(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(2));
    }
}
