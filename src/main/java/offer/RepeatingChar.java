package offer;

/**
 * @author kangkang lou
 */
public class RepeatingChar {

    public static int FirstNotRepeatingChar(String str) {
        int[] arr = new int[10001];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)] += 1;
        }
        char c = '#';
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)] == 1) {
                c = str.charAt(i);
                index = i;
                break;
            }
        }
        System.out.println(c);
        return index;
    }

    public static void main(String[] args) {
        String str = "google";
        System.out.println(FirstNotRepeatingChar(str));
    }
}
