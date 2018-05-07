package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangkang lou
 */
public class Main_166 {
    public static String fractionToDecimal(int numerator0, int denominator0) {
        StringBuilder sb = new StringBuilder();
        if ((numerator0 < 0 && denominator0 > 0) || (numerator0 > 0 && denominator0 < 0)) {
            sb.append("-");
        }
        long numerator = Math.abs((long)numerator0);
        long denominator = Math.abs((long)denominator0);
        sb.append(numerator / denominator);
        if (numerator % denominator == 0) {
            return sb.toString();
        } else {
            sb.append(".");
            numerator %= denominator;
            StringBuilder temp = new StringBuilder();
            boolean flag = false;
            List<Long> list = new ArrayList<>();
            while (numerator != 0) {
                if (list.contains(numerator)) {
                    flag = true;
                    break;
                }
                list.add(numerator);
                long a = numerator * 10;
                long b = numerator;
                while (a < denominator) {
                    temp.append("0");
                    a *= 10;
                    b *= 10;
                    list.add(b);
                }
                if (a % denominator == 0) {
                    temp.append(a / denominator);
                    break;
                } else {
                    temp.append(a / denominator);
                    numerator = a % denominator;
                }
            }
            if (flag) {
                int pos = list.indexOf(numerator);
                String s = temp.toString();
                for (int i = 0; i < s.length(); i++) {
                    if (i == pos) {
                        sb.append("(");
                    }
                    sb.append(s.charAt(i));
                }
                sb.append(")");
            } else {
                sb.append(temp.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(fractionToDecimal(-1, -2147483648));
    }
}
