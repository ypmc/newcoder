package leetcode;

/**
 * @author kangkang lou
 */
public class Main_226 {
    public TreeNode invertTree(TreeNode root) {
        mirror(root);
        return root;
    }

    public void mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        if ((root.left == null) && (root.right == null)) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }

    public static void main(String[] args) {

    }
}
