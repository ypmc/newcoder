package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_81 {
    static int commonMultiple(int a, int b) {
        int x = 1;
        int y = 1;
        while (a * x != b * y) {
            if (a * x < b * y) {
                x++;
            }
            if (a * x > b * y) {
                y++;
            }
        }
        return a * x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(commonMultiple(a, b));
        }
    }
}
