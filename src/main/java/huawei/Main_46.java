package huawei;

/**
 * @author kangkang lou
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 最小的K个
 */
public class Main_46 {

    public static ArrayList<Integer> minK(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (k > input.length || k == 0) {
            return list;
        }
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        for (int i = k; i < input.length; i++) {
            isValidNum(list, input[i]);
        }
        Collections.sort(list);
        return list;
    }

    public static void isValidNum(ArrayList<Integer> list, int num) {
        int temp = list.get(0);
        int index = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > temp) {
                temp = list.get(i);
                index = i;
            }
        }
        if (temp > num) {
            list.set(index, num);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            ArrayList<Integer> list = minK(arr, k);
            for (int i = 0, len = list.size(); i < len; i++) {
                if (i == len - 1) {
                    System.out.print(list.get(i));
                } else {
                    System.out.print(list.get(i) + " ");
                }
            }
            System.out.println();
        }
    }
}
