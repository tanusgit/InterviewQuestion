package Practice;

public class Delete5 {
    public static void main(String[] args) {

    }
    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    class Solution {
        public int solution(int N) {
            // write your code in Java SE 8
            int max = Integer.MIN_VALUE;
            String str = Integer.toString(N);
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '5'){
                    String ch = str.substring(0, i) + str.substring(i+1);
                    int chk = Integer.parseInt(ch);
                    //max = chk > max ? chk : max;
                    if(max > chk){
                        max = max;
                    }else{
                        max = chk;
                    }
                }
            }
            return max;
        }
    }

}
