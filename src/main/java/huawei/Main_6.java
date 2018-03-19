package huawei;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）
 * 最后一个数后面也要有空格
 */
public class Main_6 {
    public static void getPrimerFactors(long num) {
        long number = num;
        while (number != 1) {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    number /= i;
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLong()) {
            getPrimerFactors(in.nextLong());
        }
    }
}
