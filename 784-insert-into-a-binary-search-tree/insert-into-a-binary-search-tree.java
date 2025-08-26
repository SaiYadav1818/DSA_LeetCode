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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return insert(root,val);
    }
    public static TreeNode insert(TreeNode root,int val){
        if(root==null){
           TreeNode nn=new TreeNode(val);
           return nn;
        }
        if(root.val>val){
           root.left=insert(root.left,val);
        }
        else{
       root.right= insert(root.right,val);
        }
        return root;
    }
}