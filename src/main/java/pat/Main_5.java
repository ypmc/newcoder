package pat;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            BigInteger a = new BigInteger(in.next());
            BigInteger b = new BigInteger(in.next());
            BigInteger c = a.divide(b);
            System.out.println(c + " " + (a.subtract(b.multiply(c))));
        }
    }
}
