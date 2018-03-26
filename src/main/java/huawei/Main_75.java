package huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_75 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>(num);
            for (int i = 0; i < num; i++) {
                list.add(in.nextInt());
            }
            int flag = in.nextInt();
            if (flag == 0) {
                Collections.sort(list);
            } else {
                Collections.sort(list, (o1, o2) -> o2 - o1);
            }
            StringBuilder sb = new StringBuilder();
            for (Integer i : list) {
                sb.append(i);
                sb.append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
