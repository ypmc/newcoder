package online_2017;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author kangkang lou
 */

/**
 * 进制转换
 */
public class Main_31 {
    static String sum(int n, int m) {
        Stack<Integer> stack = new Stack<>();
        if (n == 0) {
            return "0";
        }
        boolean flag = false;
        if (n < 0) {
            n = 0 - n;
            flag = true;
        }
        while (n > 0) {
            stack.push(n % m);
            n /= m;
        }
        StringBuilder sb = new StringBuilder();
        if (flag) {
            sb.append("-");
        }
        while (!stack.empty()) {
            int temp = stack.pop();
            if (m >= 11) {
                if (temp == 10) {
                    sb.append("A");
                } else if (temp == 11) {
                    sb.append("B");
                } else if (temp == 12) {
                    sb.append("C");
                } else if (temp == 13) {
                    sb.append("D");
                } else if (temp == 14) {
                    sb.append("E");
                } else if (temp == 15) {
                    sb.append("F");
                } else {
                    sb.append(temp);
                }

            } else {
                sb.append(temp);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int m = in.nextInt();
            int n = in.nextInt();
            System.out.println(sum(m, n));
        }
    }
}
