package huawei;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_37 {
    static void print(int high) {
        BigDecimal h = BigDecimal.valueOf(high);
        int index = 0;
        BigDecimal sum = new BigDecimal(0);
        while (index < 5) {
            if (index == 0) {
                sum = sum.add(h);
            } else {
                sum = sum.add(h.add(h));
            }
            h = h.divide(BigDecimal.valueOf(2));
            index++;
        }
        System.out.println(sum);
        System.out.println(h);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int high = in.nextInt();
            print(high);
        }
    }
}
