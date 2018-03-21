package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_40 {
    static int compute(int n, String a, String b) {
        int[] x = convert(a);
        int[] y = convert(b);
        return 0;
    }

    static int[] convert(String s) {
        String[] str = s.split("\\s+");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            int n = Integer.parseInt(in.nextLine());
            String w = in.nextLine();
            String num = in.nextLine();
            System.out.println(compute(n, w, num));
        }
    }
}
