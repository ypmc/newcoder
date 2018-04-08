package online_2017;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_53 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        while (in.hasNext()) {
            set.add(in.next());
        }
        System.out.println(set.size());
    }
}
