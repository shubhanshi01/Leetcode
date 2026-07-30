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

    public int depthSubtree(TreeNode root){
        Queue<TreeNode>queue =new LinkedList<>();
        

        if(root== null) return 0;
        queue.offer(root);
        int depth=0;

        while(!queue.isEmpty()){
            int level=queue.size();
            

            for(int i=0;i<level;i++){
                TreeNode node=queue.poll();
            if(node.left!=null)queue.offer(node.left);
            if(node.right!=null)queue.offer(node.right);
            }
            depth++;

        }

        return depth;


    }
    public boolean isBalanced(TreeNode root) {

        int left=0;
        int right=0;
        if(root==null) return true;

        if(root.left!=null){
         left=depthSubtree(root.left);
        }

        if(root.right!=null)
        right=depthSubtree(root.right);

        if(Math.abs(left-right)>1){
            return false;
        }
       

       return isBalanced(root.left) && isBalanced(root.right);

    
    }
}