package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_48 {
    static boolean isPrime(int n) {
        int num = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                num++;
            }
        }
        return num == 2 ? true : false;
    }

    static void print(int n) {
        for (int i = n / 2; i >= 1; i--) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(i);
                System.out.println(n - i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            print(num);
        }
    }
}
