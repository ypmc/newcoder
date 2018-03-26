package online;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (in.hasNext()) {
            list.add(in.next());
        }
        for (String s : list) {
            System.out.println(s.indexOf("A"));
            System.out.println(s.indexOf("B"));
        }
    }
}
