package Practice;

public class Bivalued {
    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    class Solution {
        public int solution(int[] A) {
            // write your code in Java SE 8
            int res = 0;
            if(A.length == 0){
                return 0;
            }
            int lseen = -1;
            int slseen = -1;
            int count = 0;
            int replace = 0;
            for(int a : A){
                if(a == lseen || a == slseen){
                    count++;
                }else{
                    count = replace +1;
                }
                if(a == lseen){
                    replace++;
                }else{
                    replace = 1;
                    slseen = lseen;
                    lseen = a;
                }
                res = Math.max(count, res);
            }
            return res;
        }
    }

}
