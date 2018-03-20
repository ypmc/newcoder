package huawei;

import java.util.*;

/**
 * @author kangkang lou
 */

/**
 * 将规则数组排序(从小到大)，并去重。
 * 遍历输入数组，检查输入数组的每个元素是是否包含规则数组中的数字i,如果包含则将输入数组元素位置和元素输出到最终结果中。
 */
public class Main_25 {
    static void print(String[] data, String[] rule) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 1; i < rule.length; i++) {
            set.add(Integer.parseInt(rule[i]));
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, String> result = new HashMap<>();
        for (Integer r : set) {
            int index = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < data.length; i++) {
                String temp = data[i];
                if (temp.contains(String.valueOf(r))) {
                    sb.append(" ");
                    sb.append(i - 1);
                    sb.append(" ");
                    sb.append(data[i]);
                    index++;
                }
            }
            if (index > 0) {
                map.put(r, index);
                result.put(r, sb.toString().trim());
            }
        }

        int sum = map.size();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            sum += entry.getValue();
        }
        System.out.print(sum * 2);
        for (Integer r : set) {
            if (map.containsKey(r)) {
                System.out.print(" " + r + " " + map.get(r) + " " + result.get(r));
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String d = in.nextLine();
            String r = in.nextLine();
            String[] data = d.split(" ");
            String[] rule = r.split(" ");
            print(data, rule);
        }

    }
}
