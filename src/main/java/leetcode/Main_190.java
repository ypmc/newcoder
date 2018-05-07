package leetcode;

/**
 * @author kangkang lou
 */
public class Main_190 {
    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        for (int i = 0; i < 32 - s.length(); i++) {
            sb.append("0");
        }
        return (int) Long.parseLong(sb.toString(), 2);
    }

    public int reverseBits0(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;   // CATCH: must do unsigned shift
            if (i < 31) // CATCH: for last digit, don't shift!
                result <<= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Main_190().reverseBits(1024));
        System.out.println(new Main_190().reverseBits0(1));
    }
}
