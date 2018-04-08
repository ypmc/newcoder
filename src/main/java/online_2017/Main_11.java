package online_2017;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (in.hasNext()) {
            list.add(in.nextLine());
        }
        for (String s : list) {
            format(s);
        }
    }

    private static void format(String s) {
        s = s.replaceAll("\\s", "");
        int len = s.length();

        if (len <= 6) {
            System.out.println(s);
        } else if (len <= 14) {
            System.out.print(s.substring(0, 6));
            System.out.print(" ");
            System.out.println(s.substring(6, len));
        } else {
            System.out.print(s.substring(0, 6));
            System.out.print(" ");
            System.out.print(s.substring(6, 14));
            System.out.print(" ");
            System.out.println(s.substring(14, len));
        }
    }
}
