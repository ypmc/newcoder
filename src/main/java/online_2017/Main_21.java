package online_2017;

/**
 * @author kangkang lou
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 第m个数字
 */
public class Main_21 {
    static void findMth(int m, int n) {
        ArrayList<String> list = new ArrayList<>(m);
        for (int i = 1; i <= m; i++) {
            list.add(String.valueOf(i));
        }
        Collections.sort(list);
        System.out.println(list.get(n - 1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int m = in.nextInt();
            int n = in.nextInt();
            findMth(m, n);
        }
    }
}
