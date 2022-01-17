package Practice;

import java.util.ArrayList;
import java.util.List;


public class Findleaves2 {

    public static void main(String[] args) {
        //12345
        TreeNod t = new TreeNod(1);
        TreeNod two = new TreeNod(2);
        TreeNod three = new TreeNod(3);
        TreeNod four = new TreeNod(4);
        TreeNod five = new TreeNod(5);
        t.left = two;
        t.right = three;
        two.left = four;
        two.right = five;
        //List<Integer> m = new ArrayList<>();
       // List<Integer> res = Leaves2(t,  m);
      //System.out.println(res);
       // inOrder(t);
       // int h = height(t);
        //System.out.println("printig height of the tree = " + h);
        System.out.println(" " );
        int key = 2;
        if(t.val == key){
            t = null;
        }
        List<List<Integer>> m = deleteLeves(t);
        System.out.println(m );
        //delete(t, key);
       // System.out.println("after deleting 2" );
       // inOrder(t);
    }
    public static void delete(TreeNod root, int key){
        if (root == null)
            return;
       if( root.left != null && root.left.val == key){
           root.left = null;
       }
        if(  root.right != null && root.right.val == key){
            root.right = null;
        }
        delete(root.left, key);
        delete(root.right, key);
    }

    private static List<Integer> Leaves2(TreeNod root, List<Integer> m) {
        if(root == null) {
            return m;
        }
        if(root.left == null && root.right == null){
            m.add(root.val);
            //m.add(list);
            return m;
        }
        Leaves2(root.left, m);
        Leaves2(root.right, m);

        return m;
    }

    public static List<List<Integer>> deleteLeves(TreeNod t){
        List<List<Integer>> ans = new ArrayList<>();
        while(t.left != null || t.right !=null) {
            List<Integer> m = new ArrayList<>();
            //getting the leaves nodes from the tree
            Leaves2(t, m);
            //adding the first set of leave nodes to the answer list
            ans.add(m);
            System.out.println("printing " + m);
            //deleting all the leaves nodes from the list
            for (int i = 0; i < m.size(); i++) {
                delete(t, m.get(i));
            }
           // inOrder(t);
        }
        ArrayList<Integer> n = new ArrayList<>();
        n.add(t.val);
        ans.add(n);
        return ans;
    }

    public static int height(TreeNod t){
        if(t == null){
            return -1;
        }
        int height = Math.max(height(t.left), height(t.right)) + 1;
        System.out.println("height = " + height);
        return height;
    }

    public static void inOrder(TreeNod node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(" " + node.val);
        inOrder(node.right);
    }


}

class TreeNod {
    int val;
    TreeNod left;
    TreeNod right;
    TreeNod() {}
    TreeNod(int val) { this.val = val; }
    TreeNod(int val, TreeNod left, TreeNod right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}