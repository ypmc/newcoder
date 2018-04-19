package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author kangkang lou
 */
public class Main_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Stack<List<Integer>> stack = new Stack<>();
        if (root == null) {
            return list;
        }
        Queue<Queue<TreeNode>> queues = new LinkedBlockingQueue<>();
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        queue.add(root);
        queues.add(queue);

        while (!queues.isEmpty()) {
            Queue<TreeNode> q = queues.poll();
            List<Integer> l = new ArrayList<>();
            Queue<TreeNode> temp = new LinkedBlockingQueue<>();
            while (!q.isEmpty()) {
                TreeNode t = q.poll();
                l.add(t.val);
                if (t.left != null) {
                    temp.add(t.left);
                }
                if (t.right != null) {
                    temp.add(t.right);
                }
            }
            if (temp.size() > 0) {
                queues.add(temp);
            }
            stack.add(l);
        }
        while (!stack.empty()) {
            list.add(stack.pop());
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
