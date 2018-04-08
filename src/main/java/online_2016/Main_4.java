package online_2016;

import java.util.Scanner;

/**
 * @author kangkang lou
 */

public class Main_4 {

    public static void main(String[] args) {
        System.out.println(Math.floor(-8.5));
        int a = 0;
        a = a++;
        System.out.println(a);

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int k = in.nextInt();
            int i = k;
            int index = 0;
            while (i <= n) {
                for (int j = k + 1; j <= n; j++) {
                    if (i % j >= k) {
                        index++;
                        System.out.println(i + " " + j);
                    }
                }
                i++;
            }
            System.out.println(index);
        }
    }
}
