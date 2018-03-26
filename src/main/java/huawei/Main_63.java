package huawei;

import java.util.*;

/**
 * @author kangkang lou
 */
public class Main_63 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int a = in.nextInt();
            int[] m = new int[a];
            for (int i = 0; i < a; i++) {
                m[i] = in.nextInt();
            }
            int b = in.nextInt();
            int[] n = new int[b];
            for (int i = 0; i < b; i++) {
                n[i] = in.nextInt();
            }
            combine(m, n);
        }
    }

    private static void combine(int[] m, int[] n) {
        TreeSet<Integer> set = new TreeSet();
        for (int i = 0; i < m.length; i++) {
            set.add(m[i]);
        }
        for (int i = 0; i < n.length; i++) {
            set.add(n[i]);
        }
        for (Integer i : set) {
            System.out.print(i);
        }
        System.out.println();
    }
}
