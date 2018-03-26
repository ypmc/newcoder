package offer;

/**
 * @author kangkang lou
 */

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindKthToTail {

    public ListNode findKthToTail(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int i = k;
        ListNode temp = head;
        ListNode first = head;
        while (i > 0 && temp != null) {
            temp = temp.next;
            i--;
        }
        if (i > 0) {
            return null;
        }
        while (temp != null) {
            temp = temp.next;
            first = first.next;
        }
        return first;
    }

    public static void main(String[] args) {

    }
}
