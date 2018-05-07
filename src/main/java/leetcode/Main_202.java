package leetcode;

/**
 * @author kangkang lou
 */
public class Main_202 {
    public boolean isHappy(int n) {
        boolean flag;
        while (true) {
            long sum = p(n);
            if(sum>Integer.MAX_VALUE){
                flag = false;
                break;
            }
            if (sum == 1) {
                flag = true;
                break;
            } else if (sum == n) {
                flag = false;
                break;
            }
            n = (int)sum;
        }
        return flag;
    }

    public long p(int n) {
        long sum = 0;
        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Main_202 main_202 = new Main_202();
        System.out.println(main_202.isHappy(2));
    }
}
