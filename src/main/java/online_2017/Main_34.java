package online_2017;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_34 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            if ((a + c) >= 0 && (a + c) % 2 == 0 && (d + b) >= 0 && (d + b) % 2 == 0 && (d - b) >= 0 && (d - b) % 2 == 0) {
                System.out.println((a + c) / 2 + " " + (d + b) % 2 + " " + (d - b) / 2);
            } else {
                System.out.println("No");
            }
        }
    }
}
