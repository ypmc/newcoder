package leetcode;

/**
 * @author kangkang lou
 */
public class Main_83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode header = head;
        ListNode cur = head;
        ListNode next = head.next;
        while (next != null) {
            if (cur.val == next.val) {
                cur.next = next.next;
            } else {
                cur = cur.next;
            }
            next = next.next;
        }
        return header;
    }

    public static void main(String[] args) {

    }
}
