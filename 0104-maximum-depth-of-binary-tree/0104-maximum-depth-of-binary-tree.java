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
    public int maxDepth(TreeNode root) {
        int depth=0;
        int cntright=1;

        Queue<TreeNode> node=new LinkedList<>();

        if(root==null)return 0;

        if(root!=null)node.offer(root);

        while(!node.isEmpty()){
             int levelSize = node.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode parent = node.poll();


            if(parent.left!=null){
                node.offer(parent.left);
                
            }
            if(parent.right!=null){
                 node.offer(parent.right);
            
            }
            }

            depth++;
        }


        return depth;
    }
}