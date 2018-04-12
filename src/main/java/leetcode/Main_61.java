package leetcode;

/**
 * @author kangkang lou
 */
public class Main_61 {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode first = head;
        ListNode second;

        int step = 0;
        while (first != null) {
            first = first.next;
            step++;
        }
        if (step == 1) {
            return head;
        }

        k = k % step;
        if (k == 0) {
            return head;
        }
        int i = 0;
        first = head;
        second = head;

        while (i < k) {
            first = first.next;
            i++;
        }
        if (first == null) {
            return head;
        }
        while (first.next != null) {
            second = second.next;
            first = first.next;
        }
        ListNode header = second.next;
        second.next = null;
        first.next = head;
        return header;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        ListNode header = rotateRight(e, 2);
        System.out.println(header.val);
    }

}
