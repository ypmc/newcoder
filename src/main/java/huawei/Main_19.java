package huawei;

/**
 * @author kangkang lou
 */

import java.util.*;

/**
 * 开发一个简单错误记录功能小模块，能够记录出错的代码所在的文件名称和行号。
 * <p>
 * <p>
 * <p>
 * 处理：
 * <p>
 * <p>
 * <p>
 * 1、 记录最多8条错误记录，循环记录，对相同的错误记录（净文件名称和行号完全匹配）只记录一条，错误计数增加；
 * <p>
 * <p>
 * <p>
 * 2、 超过16个字符的文件名称，只记录文件的最后有效16个字符；
 * <p>
 * <p>
 * <p>
 * 3、 输入的文件可能带路径，记录文件名称不能带路径。
 * <p>
 * 题目描述有问题，不是循环记录，是记录全部错误，但只输出最后8个
 */
public class Main_19 {
    static int index = 0;
    static TreeMap<Integer, String> m = new TreeMap<>();
    static HashMap<String, Integer> map = new HashMap<>();

    static void log(String fileName, String rowNum) {
        fileName = fileName.contains("\\") ? fileName.substring(fileName.lastIndexOf("\\") + 1) : fileName;
        if (fileName.length() > 16) {
            fileName = fileName.substring(fileName.length() - 16);
        }
        String key = fileName + " " + rowNum;
        if (map.containsKey(key)) {
            map.put(key, map.get(key) + 1);
        } else {
            m.put(index++, key);
            map.put(key, 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            log(in.next(), in.next());
        }
        int index = 0;
        for (Map.Entry entry : m.entrySet()) {
            index++;
            if (index > m.size() - 8) {
                System.out.println(entry.getValue() + " " + map.get(entry.getValue()));
            }
        }
    }
}
