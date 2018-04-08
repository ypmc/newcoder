package marathon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (in.hasNext()) {
            list.add(in.nextInt());
        }
        for (Integer i : list) {
            System.out.println(count(i));
        }
    }

    private static int count(int n) {
        int index = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                index++;
            }
        }
        return index;
    }

    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }
}
