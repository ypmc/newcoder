package huawei;

import java.util.*;

/**
 * @author kangkang lou
 */
public class Main_76 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.nextLine();
            char[] ch = str.toCharArray();
            TreeMap<Character, Integer> map = new TreeMap<>(
                    Comparator.naturalOrder());
            for (char c : ch) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            ArrayList<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
            Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
            for (Map.Entry<Character, Integer> mapping : list) {
                System.out.print(mapping.getKey());
            }
            System.out.println();
        }
    }

}
