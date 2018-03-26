package offer;

/**
 * @author kangkang lou
 */
public class NumberOf1 {
    public static int NumberOf1(int n) {
        String s = Integer.toBinaryString(n);
        int num = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        NumberOf1(-8);
    }
}
