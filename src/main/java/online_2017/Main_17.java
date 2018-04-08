package online_2017;

/**
 * @author kangkang lou
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 丢失的三个数
 */
public class Main_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int[] arr = new int[10000];
            for (int i = 0; i < 10000; i++) {
                arr[i] = in.nextInt();
            }
            find(arr);
        }
    }

    static void find(int[] arr) {
        boolean[] flag = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            flag[arr[i] - 1] = true;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < flag.length; i++) {
            if (!flag[i]) {
                list.add(i + 1);
            }
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        Long value = Long.parseLong(sb.toString());
        System.out.println(value % 7);
    }
}
