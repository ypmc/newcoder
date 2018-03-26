package online;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author kangkang lou
 */

/**
 * 字串组成的最大数值
 */
public class Main_1 {
    static void sort(ArrayList<String> list) {
        StringBuilder sb = new StringBuilder();
        Collections.sort(list, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        for (String l : list) {
            sb.append(l);
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        while (in.hasNext()) {
            int num = in.nextInt();
            ArrayList<String> temp = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                temp.add(in.next());
            }
            list.add(temp);
        }
        for (ArrayList<String> l : list) {
            sort(l);
        }
    }
}
