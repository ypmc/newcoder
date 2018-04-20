package leetcode;

/**
 * @author kangkang lou
 */
public class Main_143 {
    public static void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            return;
        }
        if (head.next.next == null) {
            return;
        }
        ListNode cur = head;
        ListNode pre = head;
        while (cur.next != null) {
            pre = cur;
            cur = cur.next;
        }
        cur.next = head.next;
        head.next = cur;
        pre.next = null;
        reorderList(cur.next);
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        reorderList(a);
    }
}
