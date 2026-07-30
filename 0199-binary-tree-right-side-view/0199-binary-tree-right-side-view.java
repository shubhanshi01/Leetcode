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
    public List<Integer> rightSideView(TreeNode root) {

        Queue<TreeNode> list=new LinkedList<>();

        List<Integer> arr=new ArrayList<>();


        if(root==null) return arr;

        list.offer(root);

        

        while(!list.isEmpty()){
            int n=list.size();

            for(int i=0;i<n;i++){
                TreeNode node=list.poll();

                if(i==n-1){
                    arr.add(node.val);
                }
                if(node.left!=null){
                    list.offer(node.left);

                }
                if(node.right!=null){
                    list.offer(node.right);

                }

                

                 

            }
           
          
        }
        
    return arr;
    }
}