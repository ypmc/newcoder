package online_2017;

/**
 * @author kangkang lou
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * n个数值中最小的k个
 */
public class Main_28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (in.hasNext()) {
            list.add(in.nextInt());
        }
        int k = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        Collections.sort(list);
        for (int i = 0; i < k; i++) {
            if (i == k - 1) {
                System.out.println(list.get(i));
            } else {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}
