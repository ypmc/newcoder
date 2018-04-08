package marathon;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (in.hasNext()) {
            sb.append(numOf1(in.nextInt()));
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    static int numOf1(int n) {
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (String.valueOf(i).contains("1")) {
                index++;
            }
        }
        return index;
    }
}
