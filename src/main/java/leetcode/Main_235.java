package leetcode;

/**
 * @author kangkang lou
 */
public class Main_235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val == root.val || q.val == root.val) {
            return root;
        }
        if (root.val > p.val && root.val < q.val) {
            return root;
        }
        if (root.val > q.val && root.val < p.val) {
            return root;
        }
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
