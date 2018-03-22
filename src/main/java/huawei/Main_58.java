package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_58 {
    static void split(String str) {
        StringBuilder sb = new StringBuilder();
        str = str.replace("xcopy", "").trim();
        String a = str.substring(0, str.indexOf(" ")).trim();
        String temp = str.substring(str.indexOf(" ")).trim();
        String[] arr;
        if (temp.contains("\"")) {
            arr = temp.split("\"");
        } else {
            arr = temp.split(" ");
        }

        for (int i = 0; i < arr.length; i++) {

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            split(str);
        }
    }
}
