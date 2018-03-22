package huawei;

/**
 * @author kangkang lou
 */

import java.util.*;

/**
 * 字符串漂亮程度
 */
public class Main_42 {
    static void beautify(int n, String[] arr) {
        for (int i = 0; i < n; i++) {
            compute(arr[i]);
        }
    }

    static void compute(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0, len = str.length(); i < len; i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values, ((o1, o2) -> o2 - o1));
        int v = 26;
        int sum = 0;
        for (Integer i : values) {
            sum += i * v--;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int len = in.nextInt();
            String[] str = new String[len];
            for (int i = 0; i < len; i++) {
                str[i] = in.next();
            }
            beautify(len, str);
        }
    }
}
