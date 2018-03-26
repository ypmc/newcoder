package huawei;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_78 {
    public static void splitPadding(String str) {
        if (str.equals("")) {
            return;
        }
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0, len = str.length(); i < len; i++) {
            sb.append(str.charAt(i));
            if ((i + 1) % 8 == 0) {
                list.add(sb.toString());
                sb.delete(0, sb.length());
            }
        }
        if (sb.toString().length() != 0) {
            int len = sb.toString().length();
            for (int i = 0; i < 8 - len; i++) {
                sb.append('0');
            }
            list.add(sb.toString());
        }

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            String[] arr = new String[num];
            for (int i = 0; i < num; i++) {
                arr[i] = in.next();
            }
            for (String s : arr) {
                splitPadding(s);
            }
        }
    }

}

