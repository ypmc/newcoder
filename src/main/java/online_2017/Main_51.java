package online_2017;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 航天器损耗
 */
public class Main_51 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            long h = in.nextLong();
            long a = (int) Math.sqrt(h);
            while (a >= 0) {
                if (a * (a + 1) <= h) {
                    System.out.println(a);
                    break;
                }
                a--;
            }
        }
    }
}
