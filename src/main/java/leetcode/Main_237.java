package leetcode;

/**
 * @author kangkang lou
 */
public class Main_237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {

    }
}
