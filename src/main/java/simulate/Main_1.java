package simulate;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        System.out.println(transform(n));
    }

    public static int transform(long n) {
        if (n < 10) {
            return 0;
        }
        long sum = 1;
        long m = n;
        while (m > 0) {
            sum *= m % 10;
            m /= 10;
        }
        return 1 + transform(sum);
    }
}
