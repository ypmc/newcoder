package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author kangkang lou
 */
public class Main_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }


        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        queue.add(root);

        Queue<Queue<TreeNode>> queues = new LinkedBlockingQueue<>();
        queues.add(queue);


        while (!queues.isEmpty()) {
            List<Integer> l = new ArrayList<>();
            Queue<TreeNode> q = new LinkedBlockingQueue<>();

            queue = queues.poll();
            while (!queue.isEmpty()) {
                TreeNode t = queue.poll();
                l.add(t.val);
                if (t.left != null) {
                    q.add(t.left);
                }
                if (t.right != null) {
                    q.add(t.right);
                }
            }

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
