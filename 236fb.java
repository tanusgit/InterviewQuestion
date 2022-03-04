/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return root;
        }
         TreeNode n;
        if(isChild(p, q) == true){
            return p;
        }
        else{
         n = comAncestor(root, p, q);
            return n;
        }
        
    }
    
    public boolean isChild(TreeNode p, TreeNode r){
        if(p == null ){
            return false;
        }
        else if(r == null){
            return false;
        }
        else if(p.left == r && p.right == null){
            return true;
        }
        else if(p.right == r && p.left == null){
            return true;
        }
        else if(p.left == r || p.right == r){
            return true;
        }
        return (isChild(p.left, r) || isChild(p.right, r));
        
    }
    public TreeNode comAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return root;
        }
        TreeNode n;
        if(root.left == p && root.right == q){
            return root;
        }
        else if(root == p && root.right == q){
            return root;
        }
        else if(root == p && root.left == q){
            return root;
        }
        n = comAncestor(root.left, p, q);
        n = comAncestor(root.right, p, q);
        return n;
    }
}
