package huawei;

/**
 * @author kangkang lou
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class Main_61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.next();
            String b = in.next();
            BigDecimal m = new BigDecimal(a);
            BigDecimal n = new BigDecimal(b);
            System.out.println(m.add(n));
        }
        in.close();
    }
}