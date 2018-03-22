package huawei;

import java.util.*;

/**
 * @author kangkang lou
 */
public class Main_54 {
    static void sort(LinkedHashMap map, int flag) {
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());
        if (flag == 0) {
            Collections.sort(list, (o1, o2) -> o2.getValue() - o1.getValue());
        } else {
            Collections.sort(list, Comparator.comparingInt(Map.Entry::getValue));
        }
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
            int flag = in.nextInt();
            for (int i = 0; i < num; i++) {
                map.put(in.next(), in.nextInt());
            }
            sort(map, flag);
        }
        in.close();
    }
}
