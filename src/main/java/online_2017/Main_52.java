package online_2017;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_52 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            int[] arr = new int[num];
            int sum = 0;
            for (int i = 0; i < num; i++) {
                arr[i] = in.nextInt();
                sum += arr[i];
            }
            if (sum % num > 0) {
                System.out.println("-1");
                return;
            }
            int avg = sum / num;
            int total = 0;
            for (int i = 0; i < num; i++) {
                if (Math.abs(avg - arr[i]) % 2 > 0) {
                    System.out.println("-1");
                    return;
                } else {
                    total += (arr[i] - avg) > 0 ? (arr[i] - avg) : 0;
                }
            }
            System.out.println(total / 2);
        }
    }
}
