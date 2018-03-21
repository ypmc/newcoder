package huawei;

import java.util.Scanner;

/**
 * @author kangkang lou
 */
public class Main_41 {
    public static String[] num1 = {"zero", "one", "two", "three", "four"
            , "five", "six", "seven", "eight", "nine"};
    public static String[] num2 = {"ten", "eleven", "twelve", "thirteen", "fourteen"
            , "fifteen", "sixteen", "seventeen", "eighteen", "nighteen"};
    public static String[] num3 = {"twenty", "thirty", "forty", "fifty"
            , "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = 0;
        while (sc.hasNext()) {
            num = sc.nextLong();
            System.out.println(parse(num));
        }
    }

    public static String parse(long num) {
        if (num < 0)
            return "error";
        StringBuilder sb = new StringBuilder();
        long billion = num / 1000000000;
        //十亿部分
        if (billion != 0) {
            sb.append(translate(billion) + " billion ");//翻译十亿部分
        }
        num = num % 1000000000;
        //百万部分
        long million = num / 1000000;
        if (million != 0) {
            sb.append(translate(million) + " million ");//翻译百万部分
        }
        num = num % 1000000;
        //千部分
        long thousand = num / 1000;
        if (thousand != 0) {
            sb.append(translate(thousand) + " thousand ");//翻译千部分
        }
        //百部分
        num = num % 1000;
        if (num != 0) {
            sb.append(translate(num));//翻译百部分
        }
        return sb.toString().trim();//别忘了去除字符串后面的空格
    }

    //翻译方法
    public static String translate(long num) {
        StringBuilder sb = new StringBuilder();
        //百位处理
        long h = num / 100;
        if (h != 0) {
            //若不为0，翻译，否则不翻译
            sb.append(num1[(int) h] + " hundred");
        }
        num = num % 100;
        //十位部分
        long k = num / 10;
        if (k != 0) {
            if (h != 0)//如果有百位别忘了加and
                sb.append(" and ");
            if (k == 1) {//若十位为1，连同个位一起翻译
                long t = num % 10;
                sb.append(num2[(int) t]);
            } else {//否则，十位和个位分别单独翻译
                sb.append(num3[(int) k - 2] + " ");
                if (num % 10 != 0)
                    sb.append(num1[(int) (num % 10)]);
            }
        } else if (num % 10 != 0) {//如果没有十位部分，直接翻译个位部分
            if (h != 0)
                sb.append(" and ");
            sb.append(num1[(int) (num % 10)]);
        }
        return sb.toString().trim();
    }
}
