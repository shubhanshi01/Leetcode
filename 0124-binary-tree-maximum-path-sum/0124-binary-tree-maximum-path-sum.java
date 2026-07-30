/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum=Integer.MIN_VALUE;
    int currentPathSum =Integer.MIN_VALUE;
    public int CalGain(TreeNode root){
         if(root==null)return 0;
        int leftGain=Math.max(0,CalGain(root.left));
        int rightGain=Math.max(0,CalGain(root.right));
        int sum=root.val+ leftGain+ rightGain;

         currentPathSum = Math.max(sum, currentPathSum);
       return root.val+Math.max(leftGain,rightGain);
    }
    public int maxPathSum(TreeNode root) {
        
       CalGain(root);

        return currentPathSum;
    }
}