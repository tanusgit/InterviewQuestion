package FirstFivequestions;

import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
    String s = "B2R5G2R2";
    int m = solution(s);
    //System.out.println(m);

    }

    public static int solution(String S) {
        System.err.println("Tip: Use System.err.println() to write debug messages on the output tab.");
        int res = 0;
        char j  = 'c';
        int digit = 0;
        StringBuilder str = new StringBuilder();
        int len = S.length();
        HashMap<Integer, String> m = new HashMap();
        for(int i = 0; i <len-1; i++){
            if(i % 2 == 0) {
                 j = S.charAt(i);
                 str.append(j);
            }
            if(! (i % 2 == 0)){
                digit = Character.getNumericValue(S.charAt(i+1));
            }
            if(!m.containsKey(digit))
            m.put(digit, str.toString());

        }
        System.out.println(m);

        return 0;
    }
}
