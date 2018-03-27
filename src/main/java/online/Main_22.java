package online;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_22 {
    static boolean isPrime(int n) {
        if (n <= 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void getPrime(int n) {
        int index = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                index++;
            }
        }
        System.out.println(index);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            getPrime(n);
        }
    }
}
