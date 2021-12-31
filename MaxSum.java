package Teacher;

import java.util.ArrayList;

public class MaxSum {
    public static void main(String[] args) {
        //9
        int[] arr = {1, 2, 3, -2, 5};
        int a = maxArray2(arr, 5);
        System.out.println(a);
        //-1
        int[] arr2 = { -1, -2, -3, -4};
       // int b = maxArray2(arr2, 4);
      //  System.out.println(b);



    }

    public static int maxArray(int[] a, int n){
        int res = 0;
        int max = a[0];
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(a[0]);
        res = a[0];
        for(int i = 1; i < a.length; i++){
                 res = res + a[i];
                 arr.add(res);
            }
        for(int i : arr){
            if(max < i){
                max = i;
            }
        }

        return max;
    }
//working perfectly
    public static int maxArray2(int[] a, int n){
        int res = 0;
        int max = a[0];
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(a[0]);
        //res = a[0];
        for(int i = 0; i < a.length; i++){
            res = a[i];
            for(int j = i+1; j < a.length; j++){
                res = res  + a[j];
                System.out.println( a[i]+ " + " + a[j] + " = " + res);
                arr.add(res);
            }

        }
        for(int i : arr){
            if(max < i){
                max = i;
            }
        }

        return max;
    }
}
