package campus;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author kangkang lou
 */
public class Main_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        while (in.hasNext()) {
            String s = in.next();
            for (int i = 0; i < s.length(); i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(s.substring(0, i));
                sb.append(s.substring(i + 1, s.length()));
                set.add(sb.toString());
            }
            System.out.println(set.size());
        }
    }
}
