package online;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 购买苹果
 */
public class Main_35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = n / 8;
            int i = m;
            int total = 0;
            while (i >= 0) {
                if ((n - i * 8) % 6 == 0) {
                    total = i + (n - i * 8) / 6;
                    break;
                }
                i--;
            }
            System.out.println(total == 0 ? "-1" : total);
        }
    }
}
