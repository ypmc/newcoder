package leetcode;

/**
 * @author kangkang lou
 */
public class Main_142 {
    public ListNode detectCycle(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        ListNode f = head;
        ListNode s = null;
        while (second != null) {
            first = first.next;
            if (second.next != null) {
                second = second.next.next;
            } else {
                return null;
            }
            if (second == first) {
                s = second;
                break;
            }
        }
        if (s == null) {
            return null;
        }
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return f;
    }


    public static void main(String[] args) {

    }
}
