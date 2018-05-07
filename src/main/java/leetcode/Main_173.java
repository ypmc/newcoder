package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author kangkang lou
 */
class BSTIterator {
    Map<Integer, TreeNode> map = new TreeMap<>();
    List<Integer> list;

    void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        map.put(root.val, root);
        preOrder(root.left);
        preOrder(root.right);
    }

    public BSTIterator(TreeNode root) {
        preOrder(root);
        list = new LinkedList<>(map.keySet());
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return list.size() > 0;
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        return list.remove(0);
    }
}

public class Main_173 {
}
