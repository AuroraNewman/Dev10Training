package learn;

import java.util.LinkedList;
import java.util.Queue;

/*
problem 104
from https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
 */
public class MaxDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
