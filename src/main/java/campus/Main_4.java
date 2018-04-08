package campus;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author kangkang lou
 */
public class Main_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        Set<String> set = new HashSet();
        for (int i = 0; i < n; i++) {
            arr[i] = in.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    String temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    set.add(String.join(",", arr));
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }
        System.out.println(set.size());
    }
}
