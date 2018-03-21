package huawei;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，问每个月的兔子总数为多少？
 */
public class Main_36 {

    static int rabbit(int month) {
        if (month <= 2) {
            return 1;
        }
        return rabbit(month - 1) + rabbit(month - 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            System.out.println(rabbit(in.nextInt()));
        }
    }
}
