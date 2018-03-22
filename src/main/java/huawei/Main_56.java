package huawei;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 百钱百鸡问题
 */
public class Main_56 {
    static void print(int num) {
        for (int a = 0; a < 20; a++) {
            for (int b = 0; b < 33; b++) {
                for (int c = 0; c < 100; c = c + 3) {
                    if (a + b + c == 100 && 5 * a + 3 * b + c / 3 == 100) {
                        System.out.println(a + " " + b + " " + c);
                    }
                }
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
