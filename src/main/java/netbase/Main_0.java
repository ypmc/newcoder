package netbase;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

public class Main_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int coinCount = in.nextInt();
            StringBuilder sb = new StringBuilder();
            while (coinCount > 0) {
                if (coinCount % 2 == 0) {
                    //偶数
                    coinCount = (coinCount - 2) / 2;
                    sb.append("2");
                } else {
                    //奇数
                    coinCount = (coinCount - 1) / 2;
                    sb.append("1");
                }
            }
            System.out.println(sb.reverse().toString());
        }
    }
}
