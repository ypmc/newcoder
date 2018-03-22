package huawei;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_45 {
    static String add(String a, String b) {
        BigInteger m = new BigInteger(a);
        BigInteger n = new BigInteger(b);
        return String.valueOf(m.add(n));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.next();
            String b = in.next();
            System.out.println(add(a, b));
        }
    }
}
