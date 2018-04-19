package leetcode;

import java.util.Arrays;

/**
 * @author kangkang lou
 */
public class Main_106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder == null || postorder.length ==0) {
            return null;
        }
        if (postorder.length == 1) {
            return new TreeNode(postorder[0]);
        }
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);

        int val = postorder[postorder.length - 1];
        int pos = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == val) {
                pos = i;
                break;
            }
        }
        int[] inorderleft = Arrays.copyOfRange(inorder, 0, pos);
        int[] inorderright = Arrays.copyOfRange(inorder, pos + 1, inorder.length);
        int[] postorderleft = Arrays.copyOfRange(postorder, 0, inorderleft.length);
        int[] postordrright = Arrays.copyOfRange(postorder, inorderleft.length, inorder.length - 1);

        root.left = buildTree(inorderleft, postorderleft);
        root.right = buildTree(inorderright, postordrright);
        return root;
    }

    public static void main(String[] args) {

    }
}
