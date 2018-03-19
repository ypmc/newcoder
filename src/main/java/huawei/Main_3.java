package huawei;


import java.util.Scanner;
import java.util.TreeSet;


/**
 * @author kangkang lou
 */
public class Main_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            TreeSet<Integer> set = new TreeSet<>();
            int n = sc.nextInt();
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    set.add(sc.nextInt());
                }
            }
            for (Integer i : set) {
                System.out.println(i);
            }
        }
    }
}
