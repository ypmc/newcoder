package online_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_44 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (in.hasNext()) {
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                list.add(in.next());
            }
        }
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        a.addAll(list);
        b.addAll(list);
        Collections.sort(a, String::compareTo);
        Collections.sort(b, (Comparator.comparingInt(String::length)));
        String s0 = String.join(",", list);
        String s1 = String.join(",", a);
        String s2 = String.join(",", b);
        if (s0.equals(s1) && s0.equals(s2)) {
            System.out.println("both");
        } else if (s0.equals(s1)) {
            System.out.println("lexicographically");
        } else if (s0.equals(s2)) {
            System.out.println("lengths");
        } else {
            System.out.println("none");
        }


    }
}
