package learn;
/*
problem 114
https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
 */
public class FlattenBinaryTreeToLL {
    public void flatten(TreeNode root) {
        while (root != null){
            if (root.left != null){
                root.right = null;
            }
        }

    }
}
