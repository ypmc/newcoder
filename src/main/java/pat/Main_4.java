package pat;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine().trim();
            String[] arr = s.split(" ");
            long a = Long.parseLong(arr[0]);
            long b = Long.parseLong(arr[1]);
            long c = Long.parseLong(arr[2]);
            long d = Long.parseLong(arr[3]);
            System.out.println(Long.parseLong(String.valueOf(a).replaceAll("[^" + b + "]", "")) + Long.parseLong(String.valueOf(c).replaceAll("[^" + d + "]", "")));
        }
    }
}
