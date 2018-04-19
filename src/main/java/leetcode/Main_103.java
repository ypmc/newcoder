package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author kangkang lou
 */
public class Main_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }


        Stack<TreeNode> queue = new Stack<>();
        queue.add(root);

        Queue<Stack<TreeNode>> queues = new LinkedBlockingQueue<>();
        queues.add(queue);
        int index = 0;
        while (!queues.isEmpty()) {

            List<Integer> l = new ArrayList<>();
            Stack<TreeNode> q = new Stack<>();
            queue = queues.poll();

            while (!queue.empty()) {
                TreeNode t = queue.pop();
                l.add(t.val);
                if (index % 2 == 0) {
                    if (t.left != null) {
                        q.add(t.left);
                    }
                    if (t.right != null) {
                        q.add(t.right);
                    }
                } else {
                    if (t.right != null) {
                        q.add(t.right);
                    }
                    if (t.left != null) {
                        q.add(t.left);
                    }
                }
            }
            index++;
            list.add(l);
            if (q.size() > 0) {
                queues.add(q);
            }
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
