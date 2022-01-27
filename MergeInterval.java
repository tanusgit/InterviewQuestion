package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeInterval {
    public static void main(String[] args) {
        int a [][] = {{2,6},{15,18}, {8,10}, {1,3}};
        Arrays.sort(a, (x,y)-> x[0]-y[0]);
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
               // System.out.print(a[i][j] + " ");
            }
          //  System.out.println("");
        }
        int res [][] = merge(a);
        for(int i = 0; i < res.length; i++){
            for(int j = 0; j < res[0].length; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println("");
        }

    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (x,y) -> x[0] - y[0]);
        ArrayList<int[]> arr = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            int a = intervals[i][0];
            int b = intervals[i][1];
            if(a <= end){
                end = Math.max(end, b);
            }
            else {
                int[] ar = {start, end};
                arr.add(ar);
                start = a;
                end = b;
            }
        }
        int[] ar = {start, end};
        arr.add(ar);

        int res[][] = new int[arr.size()][2];
        for(int i = 0; i < arr.size(); i++){
            int[] x = new int[2];
            for(int j = 0; j < 2; j++){
                x[j] = arr.get(i)[j];
               // System.out.println("i = "+ i + " j = " + x[j]);
                res[i][j] = x[j];
            }
        }
        return res;


    }
}
