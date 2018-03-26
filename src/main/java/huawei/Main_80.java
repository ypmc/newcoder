package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_80 {
    public static double getCubeRoot(double input) {
        double min = 0;
        double max = input;
        double mid = 0;

        while ((max - min) > 0.001) {
            mid = (max + min) / 2;
            if (mid * mid * mid > input)
                max = mid;
            else if (mid * mid * mid < input)
                min = mid;
            else
                return mid;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double input = sc.nextDouble();
            System.out.printf("%.1f\n", getCubeRoot(input));
        }
        sc.close();
    }
}
