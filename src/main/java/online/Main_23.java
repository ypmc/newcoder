package online;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_23 {
    static void show(int m, int n) {
        if (m >= 1 && m <= 1024 && n >= 1 && n <= 1024) {
            if (m == n) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println("-1");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            show(a, b);
        }
    }
}
