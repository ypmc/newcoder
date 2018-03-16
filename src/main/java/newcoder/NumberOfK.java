package newcoder;

/**
 * @author kangkang lou
 */
public class NumberOfK {
    public int GetNumberOfK(int[] array, int k) {
        int result = 0;
        for (int i = 0, len = array.length; i < len; i++) {
            if (k == array[i]) {
                result += 1;
            } else if (k < array[i]) {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
