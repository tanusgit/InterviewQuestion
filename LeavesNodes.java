package Practice;
import java.util.ArrayList;
import java.util.List;

public class LeavesNodes {
        public List<List<Integer>> findLeaves(TreeNode root) {
            List<List<Integer>> arr = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            if(root.left == null && root.right == null){
                list.add(root.val);
                arr.add(list);
            }
            if(root == null){
                return arr;
            }
            if(root.left != null){
                arr.addAll(findLeaves(root.left));
                // System.out.println(arr);

            }
            if(root.right != null){
                arr.addAll(findLeaves(root.right));
                //System.out.println(arr);
            }
            System.out.println(arr);
            return arr;
    }
}
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
