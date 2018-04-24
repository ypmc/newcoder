package leetcode;

/**
 * @author kangkang lou
 */
public class Main_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a = 0;
        int b = 0;
        ListNode A = headA;
        ListNode B = headB;
        while (A != null) {
            a++;
            A = A.next;
        }
        while (B != null) {
            b++;
            B = B.next;
        }
        A = headA;
        B = headB;
        int index = 0;
        if (a < b) {
            while (index < b - a) {
                index++;
                B = B.next;
            }
        } else {
            while (index < a - b) {
                index++;
                A = A.next;
            }
        }

        while (A != null && B != null) {
            if (A == B) {
                return A;
            }
            A = A.next;
            B = B.next;
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
