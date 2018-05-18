package leetcode;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author kangkang lou
 */
class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root == null) {
            return sb.toString();
        }
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            sb.append(temp.val);
            sb.append(" ");
            if (temp.left != null) {
                queue.add(temp.left);
            } else {
                sb.append("$");
                sb.append(" ");
            }
            if (temp.right != null) {
                queue.add(temp.right);
            } else {
                sb.append("$");
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public String serialize0(TreeNode root) {
        StringBuilder b = new StringBuilder();
        walkForward(root, b);
        return b.toString();
    }

    void walkForward(TreeNode node, StringBuilder b) {
        if (node == null) {
            b.append("$ ");
            return;
        }
        b.append(node.val);
        b.append(" ");

        walkForward(node.left, b);
        walkForward(node.right, b);
    }

    int index = 0;

    public TreeNode deserialize(String data) {
        String[] list = data.split(" ");
        TreeNode node = walkBack(list);
        return node;
    }

    TreeNode walkBack(String[] list) {
        if (index == list.length || list[index].equals("$")) {
            index++;
            return null;
        }

        TreeNode node = new TreeNode(Integer.valueOf(list[index++]));
        node.left = walkBack(list);
        node.right = walkBack(list);
        return node;
    }
}

public class Main_297 {

    public static void main(String[] args) {
        Codec codec = new Codec();
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        a.left = b;
        a.right = c;
        c.left = d;
        c.right = e;
        System.out.println(codec.serialize(null));
        System.out.println(codec.serialize0(null));
        TreeNode root = codec.deserialize(codec.serialize(a));
        System.out.println(root.val);
    }
}
