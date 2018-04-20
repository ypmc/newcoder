package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author kangkang lou
 */
public class Main_129 {

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        List<List<Integer>> list = new ArrayList<>();
        traversal(root, new Stack<>(), list);
        int sum = 0;
        for (List<Integer> l : list) {
            int s = 0;
            for (int i : l) {
                s = s * 10 + i;
            }
            sum += s;
        }
        return sum;
    }

    void traversal(TreeNode root, Stack<Integer> l, List<List<Integer>> list) {
        l.push(root.val);
        if (root.left == null && root.right == null) {
            list.add(new ArrayList<>(l));
        }
        if (root.left != null) {
            traversal(root.left, l, list);
        }
        if (root.right != null) {
            traversal(root.right, l, list);
        }
        l.pop();
    }


    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        new Main_129().sumNumbers(a);
    }
}
