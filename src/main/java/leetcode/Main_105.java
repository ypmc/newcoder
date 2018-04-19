package leetcode;

import java.util.Arrays;

/**
 * @author kangkang lou
 */
public class Main_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        if (preorder.length == 1) {
            return new TreeNode(preorder[0]);
        }
        TreeNode root = new TreeNode(preorder[0]);
        int val = preorder[0];
        int pos = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == val) {
                pos = i;
                break;
            }
        }
        int[] inorderRight = Arrays.copyOfRange(inorder, pos + 1, inorder.length);
        int[] inorderLeft = Arrays.copyOfRange(inorder, 0, pos);
        int[] preorderLeft = Arrays.copyOfRange(preorder, 1, inorderLeft.length + 1);
        int[] preorderRight = Arrays.copyOfRange(preorder, 1 + inorderLeft.length, preorder.length);
        root.left = buildTree(preorderLeft, inorderLeft);
        root.right = buildTree(preorderRight, inorderRight);
        return root;
    }

    public static void build(int[] preorder, int[] inorder, TreeNode root) {
        int val = preorder[0];
        int pos = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == val) {
                pos = i;
                break;
            }
        }
        int[] inorderRight = Arrays.copyOfRange(inorder, pos + 1, inorder.length);
        int[] inorderLeft = Arrays.copyOfRange(inorder, 0, pos);
        int[] preorderLeft = Arrays.copyOfRange(preorder, 1, inorderLeft.length + 1);
        int[] preorderRight = Arrays.copyOfRange(preorder, 1 + inorderLeft.length, preorder.length);

    }

    public static void main(String[] args) {
        int[] pre = {3, 9, 20, 15, 7};
        int[] in = {9, 3, 15, 20, 7};
        build(pre, in, null);
    }
}
