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

    public int dfs(TreeNode node,int pathMax)
    {
        if(node==null) return 0;

        int cnt=node.val>=pathMax?1:0;
        int newPath=Math.max(pathMax,node.val);

        cnt+=dfs( node.left,newPath);
        cnt+=dfs( node.right,newPath);

        return cnt;

    }
    public int goodNodes(TreeNode root) {
       
        if(root==null) return 0;
       

       return dfs(root,root.val);
        
    }
}