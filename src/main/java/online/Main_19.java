package online;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_19 {
    static int sum(int n, int m) {
        int sum = 0;
        while (n > 0) {
            sum += n % m;
            n /= m;
        }
        return sum;
    }

    static void format(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            int sum = 0;
            for (int j = 2; j < n; j++) {
                sum += sum(n, j);
            }
            System.out.println(output(sum, n - 2));
        }
    }

    static String output(int m, int n) {
        int min = Math.min(m, n);
        for (int i = 2; i <= min; i++) {
            if (m % i == 0 && n % i == 0) {
                m = m / i;
                n = n / i;
                i--;
            }
        }
        return String.format("%s/%s", m, n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (in.hasNext()) {
            list.add(in.nextInt());
        }
        format(list);
    }
}
