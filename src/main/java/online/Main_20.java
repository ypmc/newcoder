package online;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author kangkang lou
 */
public class Main_20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int m = in.nextInt();
            int n = in.nextInt();
            TreeSet a = new TreeSet();
            TreeSet b = new TreeSet();
            for (int i = 0; i < m; i++) {
                a.add(in.nextInt());
            }
            for (int i = 0; i < n; i++) {
                b.add(in.nextInt());
            }
            a.addAll(b);
            Iterator<Integer> iter = a.iterator();
            StringBuilder sb = new StringBuilder();
            while (iter.hasNext()) {
                sb.append(iter.next());
                sb.append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
