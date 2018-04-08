package online_2017;

/**
 * @author kangkang lou
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 从n个整数中查找出现次数超过一半的数
 */
public class Main_27 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (in.hasNext()) {
            list.add(in.nextInt());
        }
        find(list);
    }

    private static void find(ArrayList<Integer> list) {
        Collections.sort(list);
        System.out.println(list.get(list.size() / 2 - 1));
    }
}
