package leetcode;

import java.math.BigDecimal;

/**
 * @author kangkang lou
 */
public class Main_3 {
    public String multiply(String num1, String num2) {
        BigDecimal x = new BigDecimal(num1);
        BigDecimal y = new BigDecimal(num2);
        return x.multiply(y).toString();
    }

    public static void main(String[] args) {

    }
}
