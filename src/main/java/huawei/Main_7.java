package huawei;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 */
public class Main_7 {
    static int float2int(String s) {
        String pre = s.substring(0, s.indexOf("."));
        String next = s.substring(s.indexOf(".") + 1, s.indexOf(".") + 2);
        return Integer.parseInt(pre) + ("5".compareTo(next) > 0 ? 0 : 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(float2int(in.next()));
        }
    }
}
