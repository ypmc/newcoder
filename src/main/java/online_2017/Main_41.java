package online_2017;


/**
 * @author kangkang lou
 * <p>
 * 首尾指针跟踪
 * 两个数不相等就进行加法：小的数加上相邻的值
 * 现在给出一个数字序列，允许使用一种转换操作：
 * 选择任意两个相邻的数，然后从序列移除这两个数，并用这两个数字的和插入到这两个数之前的位置(只插入一个和)。
 * 现在对于所给序列要求出最少需要多少次操作可以将其变成回文序列。
 */

/**
 * 首尾指针跟踪
 * 两个数不相等就进行加法：小的数加上相邻的值
 * 现在给出一个数字序列，允许使用一种转换操作：
 * 选择任意两个相邻的数，然后从序列移除这两个数，并用这两个数字的和插入到这两个数之前的位置(只插入一个和)。
 * 现在对于所给序列要求出最少需要多少次操作可以将其变成回文序列。
 */

import java.util.Scanner;

public class Main_41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int times = 0;
            int n = in.nextInt();
            int[] inputArr = new int[n];
            for (int i = 0; i < n; i++) {
                inputArr[i] = in.nextInt();
            }
            int head = 0;
            int tail = n - 1;
            while (head < tail) {
                if (inputArr[head] > inputArr[tail]) {
                    inputArr[--tail] += inputArr[tail + 1];
                    times++;
                } else if (inputArr[head] < inputArr[tail]) {
                    inputArr[++head] += inputArr[head - 1];
                    times++;
                } else {
                    head++;
                    tail--;
                }
            }
            System.out.println(times);
        }
        in.close();
    }
}

