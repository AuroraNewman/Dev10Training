package learn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
problem 637
https://leetcode.com/problems/average-of-levels-in-binary-tree/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class AverageLevelsinBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
//        search breadth first
        List<Double> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);
        while(!nodeQueue.isEmpty()){
            double sum = 0;
            int n = nodeQueue.size();;
            for (int i = 0; i < n; i++){
                TreeNode node = nodeQueue.poll();
                sum+= node.val;
                if (node.left!=null){
                    nodeQueue.offer(node.left);
                }
                if (node.right!=null){
                    nodeQueue.offer(node.right);
                }
                result.add(sum / n);
            }
        }
        return result;
    }
}
