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
    public void BFS(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        if(root == null){
            return m;
        }
        que.add(root);
        while(!que.isEmpty()){
            root = que.remove();
            System.out.println(root.val);
            if(root.left != null){
                que.add(root.left);
            }
            if(root.right  != null){
                que.add(root.right);
            }
        }
    }
    
    
}

