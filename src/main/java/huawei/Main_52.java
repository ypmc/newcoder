package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_52 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            String str = sc.next();
            int top = 1, index = 1;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'U') {
                    if (top == index) {
                        top = top == 1 ? num - 3 : top - 1;
                    }
                    index = (index == 1) ? num : index - 1;
                } else if (str.charAt(i) == 'D') {
                    if (top + 3 == index) {
                        top = index == num ? 1 : top + 1;
                    }
                    index = index == num ? 1 : index + 1;
                }
            }
            if (num < 4) top = 1;
            for (int i = 0; i < 3 && i < num - 1; i++) {
                System.out.print(top + i + " ");
            }
            System.out.println(top + (4 > num ? num - 1 : 3));
            System.out.println(index);
        }
    }
}