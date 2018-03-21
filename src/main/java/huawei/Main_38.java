package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_38 {
    static int checkNet(String mask, String ip1, String ip2) {
        int result;
        if (checkMask(mask) && check(ip1) && check(ip2)) {
            int m = ip2num(mask);
            int a = ip2num(ip1);
            int b = ip2num(ip2);
            int r1 = m & a;
            int r2 = m & b;
            if (r1 == r2) {
                result = 0;
            } else {
                result = 2;
            }
        } else {
            //输入非法
            result = 1;
        }
        return result;
    }

    static boolean isValid(String num) {
        try {
            int n = Integer.parseInt(num);
            return n >= 0 && n <= 255;
        } catch (Exception e) {
            return false;
        }
    }

    static boolean checkMask(String mask) {
        boolean result = true;
        String[] arr = mask.split("\\.");

        for (int i = 0; i < arr.length; i++) {
            if (!isValid(arr[i])) {
                result = false;
                break;
            }
        }
        String str = mask.replaceAll("\\.", "");
        if (str.lastIndexOf(".") >= str.indexOf("0")) {
            result = false;
        }
        return result;
    }

    static boolean check(String ip) {
        String[] arr = ip.split("\\.");
        if (arr.length == 4) {
            if (isValid(arr[0]) && isValid(arr[1]) && isValid(arr[2]) && isValid(arr[3])) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    static int ip2num(String ip) {
        String[] arr = ip.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(Integer.toBinaryString(Integer.parseInt(arr[i])));
        }
        return Integer.parseInt(sb.toString(), 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String mask = in.next();
            String ip1 = in.next();
            String ip2 = in.next();
            System.out.println(checkNet(mask, ip1, ip2));
        }
    }
}
