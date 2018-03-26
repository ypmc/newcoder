package huawei;

/**
 * @author kangkang lou
 */

import java.util.Scanner;

/**
 * 密码评级
 */
public class Main_67 {
    static int lenScore(String str) {
        int len = str.length();
        return len <= 4 ? 5 : len >= 8 ? 25 : 10;
    }

    static int charScore(String str) {
        //没有字母
        if (str.replaceAll("[a-zA-Z]", "").length() == str.length()) {
            return 0;
        } else {
            String temp = str.replaceAll("[^a-zA-Z]", "");
            if (temp.equals(temp.toUpperCase()) || temp.equals(temp.toLowerCase())) {
                return 10;
            } else {
                return 25;
            }
        }
    }

    static int numScore(String str) {
        if (str.replaceAll("[0-9]", "").length() == str.length()) {
            return 0;
        } else if (str.replaceAll("[0-9]", "").length() + 1 == str.length()) {
            return 10;
        } else {
            return 25;
        }
    }

    static int flagScore(String str) {
        if (str.replaceAll("[^0-9A-Za-z]", "").length() == 0) {
            return 0;
        } else if (str.replaceAll("[^0-9A-Za-z]", "").length() == 1) {
            return 10;
        } else {
            return 25;
        }
    }

    static int combineScore(String str) {
        if (numScore(str) > 0 && charScore(str) == 25 && flagScore(str) > 0) {
            return 5;
        } else if (numScore(str) > 0 && charScore(str) > 0 && flagScore(str) > 0) {
            return 3;
        } else if (numScore(str) > 0 && charScore(str) > 0) {
            return 2;
        } else {
            return 0;
        }
    }

    static String evaluate(String str) {
        String result;
        int sum = 0;
        sum += lenScore(str);
        sum += charScore(str);
        sum += numScore(str);
        sum += flagScore(str);
        sum += combineScore(str);
        if (sum >= 90) {
            result = "VERY_SECURE";
        } else if (sum >= 80) {
            result = "SECURE";
        } else if (sum >= 70) {
            result = "VERY_STRONG";
        } else if (sum >= 60) {
            result = "STRONG ";
        } else if (sum >= 50) {
            result = "AVERAGE";
        } else if (sum >= 25) {
            result = "WEAK";
        } else {
            result = "VERY_WEAK";
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(evaluate(in.next()));
        }
    }
}
