package leetcode;

/**
 * @author kangkang lou
 */
enum AccountType {
    SAVING, FIXED, CURRENT;

    private AccountType() {
        System.out.println("it's a account type");
    }
}

public class Test extends Thread {
    public void start() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        int[][] f = new int[6][];
        Test t = new Test();
        t.run();
        System.out.println(AccountType.FIXED);
    }
}
