package online_2016;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author kangkang lou
 */
public class Main_2 {

    public static void main(String[] args) {
        int[] prices = {5, 15, 56, 26, 62, 65, 57, 69};

        int firstBuy = Integer.MIN_VALUE, firstSell = 0;
        int secondBuy = Integer.MIN_VALUE, secondSell = 0;
        for (int curPrice : prices) {
            firstBuy = Math.max(firstBuy, -curPrice);
            firstSell = Math.max(firstSell, firstBuy + curPrice);
            secondBuy = Math.max(secondBuy, firstSell - curPrice);
            secondSell = Math.max(secondSell, secondBuy + curPrice);
        }
        System.out.println(secondSell);

    }
}
