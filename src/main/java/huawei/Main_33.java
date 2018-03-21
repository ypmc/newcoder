package huawei;

/**
 * @author kangkang lou
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 字符串排序
 */
public class Main_33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            System.out.println(sort(str));
        }
    }

    private static String sort(String str) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (Character character : list) {
            sb.append(character);
        }
        return sb.toString();
    }
}
