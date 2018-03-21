package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */

/**
 * ip地址转换
 */
public class Main_32 {
    static boolean isValid(String num) {
        return Integer.parseInt(num) >= 0 && Integer.parseInt(num) <= 255;
    }

    static String format(String str) {
        return String.format("%8s", str).replace(' ', '0');
    }

    static long ip2num(String ip) {
        String[] arr = ip.split("\\.");
        if (arr.length == 4) {
            if (isValid(arr[0]) && isValid(arr[1]) && isValid(arr[2]) && isValid(arr[3])) {
                StringBuilder sb = new StringBuilder();
                sb.append(format(Integer.toBinaryString(Integer.parseInt(arr[0]))));
                sb.append(format(Integer.toBinaryString(Integer.parseInt(arr[1]))));
                sb.append(format(Integer.toBinaryString(Integer.parseInt(arr[2]))));
                sb.append(format(Integer.toBinaryString(Integer.parseInt(arr[3]))));
                return Long.parseLong(sb.toString(), 2);
            } else {
                return 0;
            }
        } else {
            return 0;
        }

    }

    static String num2ip(String num) {
        try {
            String str = Long.toBinaryString(Long.parseLong(num));
            str = String.format("%32s", str).replace(' ', '0');
            String a = String.valueOf(Integer.parseInt(str.substring(0, 8), 2));
            String b = String.valueOf(Integer.parseInt(str.substring(8, 16), 2));
            String c = String.valueOf(Integer.parseInt(str.substring(16, 24), 2));
            String d = String.valueOf(Integer.parseInt(str.substring(24, 32), 2));
            if (isValid(a) && isValid(b) && isValid(c) && isValid(d)) {
                return String.format("%s.%s.%s.%s", a, b, c, d);
            } else {
                return "";
            }
        } catch (Exception e) {
            return "";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String ip = in.nextLine();
            String num = in.nextLine();
            System.out.println(ip2num(ip));
            System.out.println(num2ip(num));
        }
    }
}
