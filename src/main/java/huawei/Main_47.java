package huawei;

import java.util.*;

/**
 * @author kangkang lou
 */
public class Main_47 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.next();
            System.out.println(find(str));
        }
    }

    private static String find(String str) {
        String result = "-1";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0, len = str.length(); i < len; i++) {
            char key = str.charAt(i);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result = String.valueOf(entry.getKey());
                break;
            }
        }
        return result;
    }
}
