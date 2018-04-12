package leetcode;

/**
 * @author kangkang lou
 */
public class Main_23 {
    public ListNode mergeKLists(ListNode[] lists) {
        return partion(lists, 0, lists.length - 1);
    }

    public static ListNode partion(ListNode[] lists, int s, int e) {
        if (s == e) return lists[s];
        if (s < e) {
            int q = (s + e) / 2;
            ListNode l1 = partion(lists, s, q);
            ListNode l2 = partion(lists, q + 1, e);
            return merge(l1, l2);
        } else {
            return null;
        }
    }

    public static ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(4);

        ListNode d = new ListNode(1);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(4);
        ListNode g = new ListNode(5);

        ListNode m = new ListNode(-1);
        ListNode n = new ListNode(6);


        a.next = b;
        b.next = c;

        d.next = e;
        e.next = f;
        f.next = g;

        m.next = n;
        ListNode[] arr = new ListNode[3];
        arr[0] = a;
        arr[1] = d;
        arr[2] = m;
        System.out.println(new Main_23().mergeKLists(arr));
    }
}
