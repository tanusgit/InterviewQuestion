package Practice;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CountRepeatedelements {
    public static void main(String[] args) {
        int [] a = {2, 3, 1, 2, 3, 3, 3};
        int b[] = findDuplicates(a);
        for(int i  = 0;  i < b.length; i++){
            System.out.print(b[i]);
        }
    }


        public static int[] findDuplicates(int[] arr) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i  = 0;  i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        System.out.print(map);
        ArrayList<Integer> a = new ArrayList<>();
        for(int i  = 0;  i < map.size(); i++){
            if(map.get(arr[i]) > 1){
                a.add(arr[i]);
            }
        }
        int b[] = new int[a.size()];

        for(int i  = 0;  i < a.size(); i++){
           b[i] = a.get(i);
        }

        return b;
    }

}
/*
Given an array arr[] of size N which contains elements from 0 to N-1, find all the elements occurring more than once in the given array.
*/
