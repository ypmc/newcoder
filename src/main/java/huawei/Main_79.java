package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_79 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            System.out.println(reverse(str));
        }
    }

    private static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
