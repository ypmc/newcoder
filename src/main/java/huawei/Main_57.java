package huawei;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_57 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int year = in.nextInt();
            int month = in.nextInt();
            int day = in.nextInt();
            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month - 1, day );
            System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        }
    }
}
