package newcoder;

/**
 * @author kangkang lou
 */

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class ListMerge {
    public static ListNode merge(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode temp;
        ListNode t = null;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp = list1;
                list1 = list1.next;
            } else {
                temp = list2;
                list2 = list2.next;
            }
            if (head == null) {
                head = temp;
                t = head;
            } else {
                t.next = temp;
                t = t.next;
                t.next = null;
            }
        }
        if (head == null) {
            if (list1 != null) {
                head = list1;
                t = head;
                list1 = list1.next;
            }else if (list2 != null) {
                head = list2;
                t = head;
                list2 = list2.next;
            }
        }
        while (list1 != null) {
            t.next = list1;
            t = t.next;
            list1 = list1.next;
        }
        while (list2 != null) {
            t.next = list2;
            t = t.next;
            list2 = list2.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode t0 = new ListNode(1);
        ListNode t1 = new ListNode(3);
        ListNode t2 = new ListNode(5);
        t0.next = t1;
        t1.next = t2;
        t2.next = null;
        ListNode t = merge(t0, null);
        while (t != null) {
            System.out.println(t.val);
            t = t.next;
        }

    }
}
