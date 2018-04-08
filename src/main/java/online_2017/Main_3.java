package online_2017;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kangkang lou
 */

/**
 * 字符串反转
 */
public class Main_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (in.hasNext()) {
            list.add(in.nextLine());
        }
        for (String s : list) {
            reverse(s);
        }
    }

    private static void reverse(String s) {
        String[] arr = s.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
