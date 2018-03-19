package huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author kangkang lou
 */

/**
 * 给定n个字符串，请对n个字符串按照字典序排列
 */
public class Main_14 {
    static void sort(List<String> list) {
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int index = 0;
        List<String> list = new ArrayList<>();
        while (index < num) {
            index++;
            list.add(in.next());
        }
        sort(list);
    }
}
