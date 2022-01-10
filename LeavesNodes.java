package Practice;
import java.util.ArrayList;
import java.util.List;

public class LeavesNodes {

    public static void main(String[] args) {
        //12345
        TreeNode t = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        t.left = two;
        t.right = three;
        two.left = four;
        two.right = five;
        List<List<Integer>> res = findLeaves(t);

    }
        public static List<List<Integer>> findLeaves(TreeNode root) {
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


    public List<List<Integer>> findLeaves2(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();

        if(root == null){
            return arr;
        }
        solver(root, arr);

        return arr;
    }

    public int solver(TreeNode root, List<List<Integer>> arr){
        if(root == null){
            return -1;
        }
        int ref = Math.max(solver(root.left, arr), solver(root.right, arr)) + 1;
        if(arr.size() <= ref){
            arr.add(new ArrayList());
        }
        arr.get(ref).add(root.val);
        return ref;
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
