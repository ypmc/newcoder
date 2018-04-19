package leetcode;

/**
 * @author kangkang lou
 */
public class Main_98 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) return true;
        if (root.val >= maxVal || root.val <= minVal) return false;
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }


    public static void main(String[] args) {
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(30);
        TreeNode c = new TreeNode(10);
        TreeNode d = new TreeNode(15);
        TreeNode e = new TreeNode(45);
        a.right = b;
        b.left = c;
        c.right = d;
        d.right = e;
        new Main_98().isValidBST(a);
    }
}
