package pat;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (in.hasNext()) {
            int num = in.nextInt();
            for (int i = 0; i < num; i++) {
                list.add(in.nextInt());
            }
        }
        int A1 = 0, A2 = 0, A3 = 0, A5 = -Integer.MAX_VALUE, s4 = 0;
        float A4;
        int index = 1;
        int times = 0;
        boolean flag = false;
        for (Integer i : list) {
            if (i % 5 == 0 && i % 2 == 0) {
                A1 += i;
            }
            if (i % 5 == 1) {
                if (index % 2 > 0) {
                    A2 += i;
                } else {
                    A2 -= i;
                }
                index++;
                flag = true;
            }
            if (i % 5 == 2) {
                A3++;
            }
            if (i % 5 == 3) {
                s4 += i;
                times++;
            }
            if (i % 5 == 4) {
                if (i > A5) {
                    A5 = i;
                }
            }
        }
        A4 = (float) s4 / times;
        System.out.println((A1 > 0 ? A1 : "N") + " " + (flag == true ? A2 : "N") + " " + (A3 > 0 ? A3 : "N") + " " + (times > 0 ? String.format("%.1f", A4) : "N") + " " + (A5 > -Integer.MAX_VALUE ? A5 : "N"));
    }
}
