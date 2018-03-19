package huawei;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_22 {
    static int drink(int num) {
        if (num <= 1) {
            return 0;
        }
        if (num == 2) {
            return 1;
        }
        return num / 3 + drink(num / 3 + num % 3);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (in.hasNextInt()) {
            int temp = in.nextInt();
            if (temp == 0) {
                break;
            }
            list.add(drink(temp));
        }
        for (Integer n : list) {
            System.out.println(n);
        }
    }
}
