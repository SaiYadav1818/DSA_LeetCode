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
    public int countNodes(TreeNode root) {
        int count=1;
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(queue.size()!=0){
       TreeNode val=queue.poll();
        if(val.left!=null){
            queue.add(val.left);
            count++;
        }
        if(val.right!=null){
            queue.add(val.right);
            count++;
        }
        }
        return count;
    }
}