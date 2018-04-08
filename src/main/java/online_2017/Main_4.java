package online_2017;

/**
 * @author kangkang lou
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 号码分身
 * 继MIUI8推出手机分身功能之后，MIUI9计划推出一个电话号码分身的功能：首先将电话号码中的每个数字加上8取个位，然后使用对应的大写字母代替 （"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"）， 然后随机打乱这些字母，所生成的字符串即为电话号码对应的分身。
 */
public class Main_4 {

    static void decrypt(String str) {
        HashMap<Character, Integer> counter = count(str);
        int a0, a1, a2, a3, a4, a5, a6, a7, a8, a9;
        a0 = counter.getOrDefault('Z', 0);
        a2 = counter.getOrDefault('W', 0);
        a4 = counter.getOrDefault('U', 0);
        a6 = counter.getOrDefault('X', 0);
        a7 = counter.getOrDefault('S', 0) - a6;
        a5 = counter.getOrDefault('V', 0) - a7;
        a1 = counter.getOrDefault('O', 0) - a0 - a4 - a2;
        a9 = (counter.getOrDefault('N', 0) - a1 - a7) / 2;
        a8 = counter.getOrDefault('I', 0) - a5 - a6 - a9;
        a3 = counter.getOrDefault('H', 0) - a8;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < a0; i++) {
            list.add("2");
        }
        for (int i = 0; i < a1; i++) {
            list.add("3");
        }
        for (int i = 0; i < a2; i++) {
            list.add("4");
        }
        for (int i = 0; i < a3; i++) {
            list.add("5");
        }
        for (int i = 0; i < a4; i++) {
            list.add("6");
        }
        for (int i = 0; i < a5; i++) {
            list.add("7");
        }
        for (int i = 0; i < a6; i++) {
            list.add("8");
        }
        for (int i = 0; i < a7; i++) {
            list.add("9");
        }
        for (int i = 0; i < a8; i++) {
            list.add("0");
        }
        for (int i = 0; i < a9; i++) {
            list.add("1");
        }
        Collections.sort(list, ((o1, o2) -> (o1 + o2).compareTo(o2 + o1)));
        System.out.println(String.join("", list));
    }

    static HashMap<Character, Integer> count(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        return map;
    }

    static boolean isExist(String a, String b) {
        boolean result = true;
        for (int i = 0; i < a.length(); i++) {
            if (!b.contains(String.valueOf(a.charAt(i)))) {
                result = false;
                break;
            }
        }
        if (a.equals("NINE")) {
            return b.length() - b.replaceAll("N", "").length() >= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (in.hasNext()) {
            int num = in.nextInt();
            for (int i = 0; i < num; i++) {
                list.add(in.next());
            }
        }
        for (String s : list) {
            decrypt(s);
        }
    }
}
