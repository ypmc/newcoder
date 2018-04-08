package leetcode;

import java.math.BigInteger;

/**
 * @author kangkang lou
 */
public class Main_9 {

    public static int myAtoi(String str) {
        str = str.trim();
        boolean flag = true;
        if (str.startsWith("+")) {
            str = str.substring(1);
            if (str.startsWith("+") || str.startsWith("-")) {
                return 0;
            }
            flag = true;
        } else if (str.startsWith("-")) {
            str = str.substring(1);
            if (str.startsWith("+") || str.startsWith("-")) {
                return 0;
            }
            flag = false;
        }

        String[] arr = str.split("[^0-9]+");
        BigInteger r;
        if (flag) {
            if (arr.length > 0 && !arr[0].equals("")) {
                r = new BigInteger(arr[0]);
            } else {
                r = new BigInteger("0");
            }
        } else {
            if (arr.length > 0 && !arr[0].equals("")) {
                r = new BigInteger("-" + arr[0]);
            } else {
                r = new BigInteger("0");
            }
        }
        BigInteger max = new BigInteger("2147483647");
        BigInteger min = new BigInteger("-2147483648");
        if (r.compareTo(max) > 0) {
            return 2147483647;
        } else if (min.compareTo(r) > 0) {
            return -2147483648;
        } else {
            return r.intValue();
        }

    }

    public static void main(String[] args) {
        System.out.println(myAtoi("9223372036854775809"));
    }
}
