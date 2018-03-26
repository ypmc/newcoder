package huawei;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_71 {
    static void classify(String[] key, String[] votes) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < key.length; i++) {
            map.put(key[i], 0);
        }
        map.put("Invalid", 0);
        for (int i = 0; i < votes.length; i++) {
            if (map.containsKey(votes[i])) {
                map.put(votes[i], map.get(votes[i]) + 1);
            } else {
                map.put("Invalid", map.get("Invalid") + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int m = in.nextInt();
            String[] key = new String[m];
            for (int i = 0; i < m; i++) {
                key[i] = in.next();
            }
            int n = in.nextInt();
            String[] votes = new String[n];
            for (int i = 0; i < n; i++) {
                votes[i] = in.next();
            }

            classify(key, votes);
        }

    }
}
