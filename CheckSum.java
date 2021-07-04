import java.lang.reflect.Array;
import java.util.ArrayList;

public class CheckSum {
    public static void main(String[] args) {
       // int[] arr1 = {1, 2, 3, 5, 4, 6, 7};
        int[][] arr = {{2, 7, 9}, {3, 6, 1}, {7, 4, 2}};
        int sum = 10;
        boolean res = check(3, 3, arr, 11);
        System.out.println(res);

    }

    public static boolean check(int rows, int cols, int [][] arr, int sum ){
        boolean res = false;
        System.out.println("length of array = " + arr.length);
        ArrayList<Integer> m = new ArrayList<>();

            for(int i =0; i < rows; i++){
                for(int j = 0; j <cols; j++){
                  //  System.out.println("printing i = " + i + "  j = " + j);
                    //make a 1d array
                     m.add(arr[i][j]);
                }
            }
        for(int i =0; i < m.size(); i++) {
            for (int j = 0; j < m.size()-1; j++) {
                int s = m.get(i) + m.get(j+1);
                if(sum == s){
                    res = true;
                }
            }
        }


        return res;

    }

    public static void print1D(int [] arr1, int sum){
        ArrayList<Integer> m = new ArrayList<>();
        for(int i =0; i < arr1.length; i++){
            for(int j = 0; j <arr1.length; j++){
                int r = arr1[i] + arr1[j];
                m.add(r);
                System.out.println(arr1[i] + " + " + arr1[j] + " = " + r);
            }
        }
        for (int i =0; i < m.size(); i++){
            if(sum == m.get(i)){
                System.out.println("true");
            }
        }

    }
}
