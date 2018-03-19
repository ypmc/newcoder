package huawei;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kangkang lou
 */

/**
 * 请解析IP地址和对应的掩码，进行分类识别。
 * 要求按照A/B/C/D/E类地址归类，不合法的地址和掩码单独归类。
 */
public class Main_18 {
    private static String classify(ArrayList<String> list) {
        int typeA = 0;
        int typeB = 0;
        int typeC = 0;
        int typeD = 0;
        int typeE = 0;
        int errorIpOrMaskCode = 0;
        int privateIP = 0;
        for (String s : list) {
            String[] ipAndMaskCode = s.split("~");
            String ip = ipAndMaskCode[0];
            String maskCode = ipAndMaskCode[1];
            if (!isValidFormat(ip) || !isValidFormat(maskCode)) {
                errorIpOrMaskCode++;
                continue;
            }
            if (!validMaskCode(maskCode)) {
                errorIpOrMaskCode++;
                continue;
            }
            String fnStr = ip.substring(0, ip.indexOf("."));
            int fn = Integer.valueOf(fnStr);
            if (fn >= 1 && fn < 127) {
                typeA++;
            } else if (fn >= 128 && fn < 192) {
                typeB++;
            } else if (fn >= 192 && fn < 224) {
                typeC++;
            } else if (fn >= 224 && fn < 240) {
                typeD++;
            } else if (fn >= 240 && fn <= 255) {
                typeE++;
            }
            String ipSubStr = ip.substring(ip.indexOf(".") + 1);
            String snStr = ipSubStr.substring(0, ipSubStr.indexOf("."));
            int sn = Integer.valueOf(snStr);
            if (fn == 10 || (fn == 172 && sn >= 16 && sn <= 31) || (fn == 192 && sn == 168)) {
                privateIP++;
            }
        }
        return String.format("%s %s %s %s %s %s %s", typeA, typeB, typeC, typeD, typeE, errorIpOrMaskCode, privateIP);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (in.hasNextLine()) {
            list.add(in.nextLine());
        }
        System.out.println(classify(list));
    }

    private static boolean isValidFormat(String ip) {
        boolean res = true;
        if (ip == null || "".equals(ip))
            return false;
        Pattern pattern = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$");
        Matcher matcher = pattern.matcher(ip);

        if (matcher.matches()) {
            String[] strings = ip.split("\\.");
            for (String num : strings) {
                int n = Integer.valueOf(num);
                if (n < 0 || n > 255) {
                    res = false;
                    break;
                }
            }
        } else {
            res = false;
        }

        return res;
    }

    private static boolean validMaskCode(String maskCode) {
        boolean res = true;
        String[] strings = maskCode.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (String num : strings) {
            int n = Integer.valueOf(num);
            sb.append(binaryString(n));
        }
        int firstIndexOf0 = sb.indexOf("0");
        int lastIndexOf1 = sb.lastIndexOf("1");
        if (firstIndexOf0 < lastIndexOf1) {
            res = false;
        }
        return res;
    }

    private static String binaryString(int num) {
        StringBuilder result = new StringBuilder();
        int flag = 1 << 7;
        for (int i = 0; i < 8; i++) {
            int val = (flag & num) == 0 ? 0 : 1;
            result.append(val);
            num <<= 1;
        }
        return result.toString();
    }

}
