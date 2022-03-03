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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>>  arr = new ArrayList<>();
         levelOrder2(root,arr, 0);   
            return arr;
    }
    
    public void levelOrder2(TreeNode root,   List<List<Integer>>  arr, int level ) {
      
        if(root == null){
            return;
        }
        List <Integer> list = null;
        if(arr.size() == level){
            list = new ArrayList<>();
            arr.add(list);
        }else{
            list = arr.get(level);
        }
        list.add(root.val);
        
        levelOrder2(root.left, arr, level+1);     
        levelOrder2(root.right, arr, level+1);     
    }
}

