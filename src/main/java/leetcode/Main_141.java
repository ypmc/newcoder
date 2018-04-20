package leetcode;

/**
 * @author kangkang lou
 */
public class Main_141 {
    public boolean hasCycle(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        while (second != null) {
            first = first.next;
            if (second.next != null) {
                second = second.next.next;
            } else {
                return false;
            }
            if (second == first) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
