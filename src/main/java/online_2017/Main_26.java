package online_2017;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            reverse(str);
        }
    }

    private static void reverse(String str) {
        String[] arr = str.split("\\s+");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
