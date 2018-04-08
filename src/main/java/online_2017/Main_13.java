package online_2017;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String path = in.nextLine();
            if (path.contains(".")) {
                System.out.println(path.substring(path.lastIndexOf(".") + 1));
            } else {
                System.out.println("null");
            }
        }
    }
}
