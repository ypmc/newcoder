package online;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_45 {

    public static void main(String[] args) {
        long step = 1000000007;
        long pos;
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            long s = in.nextLong();
            int index = 1;
            pos = step * index;
            while (pos < s) {
                index++;
                pos = step * index;
            }
            long times;
            while ((times = ok(pos, s)) == -1) {
                pos = pos + step;
            }
            if (times > 100000) {
                System.out.println(-1);
            } else {
                System.out.println(times);
            }
        }

    }

    static long ok(long end, long start) {
        long a = 8 * start + 7;
        long b = 4 * start + 3;
        long sum = end - start;
        long n = sum / a;
        long index = n;

        while (index >= 0) {
            if ((sum - index * a) % b == 0) {
                return index + (sum - index * a) / b;
            }
            index--;
        }
        return -1;
    }
}
