 /*
 Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
 */



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
        List<Integer> list=new ArrayList<Integer>();
        right(list,root,0);
        return list;
    }
   public void right(List<Integer> list,TreeNode curr,int currDepth){
        if(curr==null) return;
        if(currDepth==list.size()){
        list.add(curr.val);  
        }//this will go to the right side of the tree then returns when reaches the null node
       //if right side is null then we traverse the left side to add the left nodes as that would
       //be visible if the right side of the tree is null
        right(list,curr.right,currDepth+1);
        right(list,curr.left,currDepth+1);
    
    }
}
