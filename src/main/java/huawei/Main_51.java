package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_51 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.next();
            int k = in.nextInt();
            System.out.println(find(str, k));
        }
    }

    static int rate(String str) {
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'G' || str.charAt(i) == 'C') {
                index++;
            }
        }
        return index;
    }

    private static String find(String str, int k) {
        int max = 0;
        String result = "";
        for (int i = 0; i < str.length() - k; i++) {
            String temp = str.substring(i, i + k);
            int n = rate(temp);
            if (n > max) {
                result = temp;
                max = n;
            }
        }
        return result;
    }
}
