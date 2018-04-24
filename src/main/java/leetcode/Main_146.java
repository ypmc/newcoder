package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author kangkang lou
 */
class LRUCache {
    List<Integer> list = new LinkedList<>();
    Map<Integer, Integer> map = new HashMap();
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            list.remove(Integer.valueOf(key));
            list.add(key);
            return map.get(key);
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (map.size() == capacity) {
            if (map.containsKey(key)) {
                list.remove(Integer.valueOf(key));
                list.add(key);
                map.put(key, value);
            } else {
                int k = list.get(0);
                list.remove(0);
                map.remove(k);
                list.add(Integer.valueOf(key));
                map.put(key, value);
            }
        } else {
            if (map.containsKey(key)) {
                list.remove(Integer.valueOf(key));
            }
            list.add(key);
            map.put(key, value);
        }
    }
}

public class Main_146 {

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2 /* capacity */);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));       // returns 1
        cache.put(3, 3);    // evicts key 2
        System.out.println(cache.get(2));       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        System.out.println(cache.get(1));       // returns -1 (not found)
        System.out.println(cache.get(3));       // returns 3
        System.out.println(cache.get(4));       // returns 4
    }
}
