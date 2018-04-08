package online_2017;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 连续最大和
 */
public class Main_33 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            find(arr);
        }

    }

    private static void find(int[] arr) {
        int temp = 0;
        int max = 0;
        int m = arr[0];
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > m) {
                m = arr[i];
            }
            if (arr[i] + temp < 0) {
                temp = 0;
                flag = false;
            } else {
                flag = true;
                temp += arr[i];
            }

            if (max < temp) {
                max = temp;
            }
        }
        System.out.println(flag ? max : m);
    }
}
