package marathon;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedHashMap<Integer, ArrayList<Integer>> map = new LinkedHashMap<>();
        while (in.hasNext()) {
            int total = in.nextInt();
            int num = in.nextInt();
            if (total == 0 && num == 0) {
                break;
            }
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                list.add(in.nextInt());
            }
            map.put(total, list);
        }
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            int key = entry.getKey();
            int index = 1;
            ArrayList<Integer> list = entry.getValue();
            StringBuilder sb = new StringBuilder();
            while (index <= key) {
                int len = 0;
                for (Integer i : list) {
                    if ((key + index) % i == 0) {
                        sb.append((key + 1) / i);
                        sb.append(" ");
                        len++;
                    } else {
                        index++;
                        sb.delete(0, sb.toString().length());
                        break;
                    }
                }
                if (len == list.size()) {
                    break;
                }
            }
            if (sb.toString().length() == 0) {
                System.out.println("Can't Solve");
            } else {
                System.out.println(sb.toString().trim());
            }
        }

    }
}
