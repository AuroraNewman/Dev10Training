package learn;
/*
problem 226
https://leetcode.com/problems/invert-binary-tree/
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)){
            return root;
        }
        invertTree(root.left);
        invertTree(root.right);
        TreeNode current = root.left;
        root.left = root.right;
        root.right = current;
        return root;
    }

}
