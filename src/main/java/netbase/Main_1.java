package netbase;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int a = in.nextInt();
            int b = Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString());
            System.out.println(a + b);
        }
    }
}
