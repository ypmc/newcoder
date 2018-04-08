package pat;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kangkang lou
 */

/**
 * 判断A+B是否大于C
 */
public class Main_1 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Long>> list = new ArrayList<>();
        while (in.hasNext()) {
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                ArrayList<Long> l = new ArrayList<>();
                l.add(in.nextLong());
                l.add(in.nextLong());
                l.add(in.nextLong());
                list.add(l);
            }
        }
        int index = 1;
        for (ArrayList<Long> l : list) {
            long a = l.get(0);
            long b = l.get(1);
            long c = l.get(2);
            if (c - b < a) {
                System.out.println("Case #" + index++ + ": true");
            } else {
                System.out.println("Case #" + index++ + ": false");
            }
        }
    }
}
