package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_70 {
    static boolean judge(int[] arr) {
        int sum1 = 0;
        int sum2 = 0;
        int[] a = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                sum1 += arr[i];
            } else if (arr[i] % 3 == 0) {
                sum2 += arr[i];
            } else {
                a[index++] = arr[i];
            }
        }
        int sum = Math.abs(sum1 - sum2);
        return f(0, index, a, 0, sum);
    }

    public static boolean f(int i, int n, int[] a, int result, int sum) {
        if (i == n) {
            return Math.abs(result) == sum;
        } else {
            return (f(i + 1, n, a, result + a[i], sum) || f(i + 1, n, a, result - a[i], sum));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(judge(arr));
        }
    }
}
