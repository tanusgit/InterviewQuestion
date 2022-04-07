package Practice;

public class DaysOfweek {
    public static void main(String[] args) {

    }
    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    class Solution {
        public String solution(String S, int k) {
            // write your code in Java SE 8
            String res ="";
            String arr[] = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
            int x = getIndex(S, arr);
            int y = (x + k) % 7;

            return arr[y];
        }

        public int getIndex(String s, String[] arr){
            for(int i =0; i < 7; i++ ){
                if(arr[i].equals(s)){
                    return i;
                }
            }
            return 0;
        }
    }

}
