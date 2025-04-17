package learn;

import java.util.HashMap;

/*
problem 106
https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/
 */
public class ConstructBinaryInorderPostorder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 1){
            return new TreeNode(inorder[0]);
        }
        HashMap<Integer, TreeNode> nodeMap = new HashMap<>();
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);

        nodeMap.put(root.val, root);

        return null;
    }
}
