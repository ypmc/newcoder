package online_2016;

import java.util.Scanner;

class Main_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int m = in.nextInt();
            int n = in.nextInt();
            int c = m ^ n;
            System.out.println(Integer.toBinaryString(c).replaceAll("0", "").length());
        }
    }
}