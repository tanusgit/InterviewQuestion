package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MaxPointsOnLine {

    public static void main(String[] args) {
        //[[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
        int[][] arr = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        int[][] arr2 = {{1,1},{2,2},{3,3}};
        int[][] arr3 = {{2,3},{3,3},{-5,3}};
        MaxPointsOnLine m = new MaxPointsOnLine();
        int res = m.maxPointsOnLine2(arr3);
        System.out.println(res);
    }
    public static int maxPointsOnLine2(int arr[][]) {
        double slope = 0.0;
        int count = 1;
        int max = 1;
        ArrayList<Integer> maxarr = new ArrayList<Integer>();
        //edge case for {{1,1},{2,2},{3,3}};
        for (int i = 0; i < arr.length; i++) {
            HashMap<Double, Integer> m = new HashMap<>();
            for (int j = i; j < arr.length - 1; j++) {
                if(arr[j+1][1] == arr[i][1]){
                    slope = 0;
                }else if(arr[j+1][0] == arr[i][0]){
                    slope = Double.MAX_VALUE;
                }
                else {
                    slope = ((double) arr[j + 1][1] - (double) arr[i][1]) / ((double) arr[j + 1][0] - (double) arr[i][0]);
                }
                System.out.println("slope = " + arr[j+1][1] + "-" + arr[i][1] + " / "
                        + " " + arr[j+1][0] + "-" +  arr[i][0]+ " = " + slope);
                // m.put(slope, count);
                if (m.containsKey(slope)) {
                    m.put(slope, m.get(slope) + 1);
                } else {
                    m.put(slope, 2);
                }
            }
            System.out.println(m);
            for (int res : m.values()) {
                //System.out.println("res " + res);
                if (max < res) {
                    max = res;
                }
            }
            System.out.println("max = " + max);
        }


        return max;

    }


    class Solution {
        public int maxPoints(int[][] arr) {
            double slope = 0.0;
            int count = 1;
            int max = 1;
            //edge case for {{1,1},{2,2},{3,3}};
            int al = arr.length;
            for (int i = 0; i < al; i++) {
                HashMap<Double, Integer> m = new HashMap<>();
                for (int j = i; j < al - 1; j++) {
                    if(arr[j+1][1] == arr[i][1]){
                        slope = 0;
                    }else if(arr[j+1][0] == arr[i][0]){
                        slope = Double.MAX_VALUE;
                    }
                    else {
                        slope = ((double) arr[j + 1][1] - (double) arr[i][1]) / ((double) arr[j + 1][0] - (double) arr[i][0]);
                    }
                    //System.out.println("slope = " + arr[j+1][1] + "-" + arr[i][1] + " / "
                    //        + " " + arr[j+1][0] + "-" +  arr[i][0]+ " = " + slope);
                    // m.put(slope, count);
                    if (m.containsKey(slope)) {
                        m.put(slope, m.get(slope) + 1);
                    } else {
                        m.put(slope, 2);
                    }
                    int sl = m.get(slope);
                    if (max < sl) {
                        max = sl;
                    }
                }
            /*System.out.println(m);
            for (int res : m.values()) {
                //System.out.println("res " + res);
                if (max < res) {
                    max = res;
                }
            }
            System.out.println("max = " + max);*/
            }


            return max;
        }
    }
}
