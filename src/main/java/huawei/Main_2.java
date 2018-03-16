package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String c = in.next();
        String s = str.replaceAll(c.toUpperCase(), "").replaceAll(c.toLowerCase(),"");
        System.out.println(str.length() - s.length());
    }
}
