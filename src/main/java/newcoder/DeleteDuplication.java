package newcoder;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author kangkang lou
 */

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class DeleteDuplication {
    public static ListNode deleteDuplication(ListNode pHead) {
        ListNode node = pHead;
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        while (node != null) {
            ListNode temp = node.next;
            if (map.containsKey(node.val)) {
                map.put(node.val, map.get(node.val) + 1);
            } else {
                map.put(node.val, 1);
            }
            node = temp;
        }
        ListNode header = null;
        ListNode cur = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                if (header == null) {
                    header = new ListNode(entry.getKey());
                    cur = header;
                } else {
                    cur.next = new ListNode(entry.getKey());
                    cur = cur.next;
                }
            }
        }
        return header;

    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(1);
        ListNode n6 = new ListNode(1);
        ListNode n7 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = null;
        deleteDuplication(n1);
    }
}
