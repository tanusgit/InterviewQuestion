package FirstFivequestions;
import java.util.*;
import java.util.HashSet;

public class Solution2 {
        public static void main(String[] a) {
            String arr[] = {"ck","kc","ho","kc"};
            int res = sol(arr);
            System.out.println("Result: " + res);
        }

        public static String rev(String s) {
            return new StringBuilder(s).reverse().toString();
        }

        public static int sol(String[] s) {
            int l = s.length;
            int res = 0;
            HashSet<String> map = new HashSet<String>();
            for (int i = 0; i < l; ++i) {
                String s1 = s[i];
                map.add(s1);
            }
            for (String p: map) {
 //               System.out.println("entries: " + s[i]);
                if (map.contains(rev(p))) {
                    res = res + p.length();
                    //System.out.println("res: " + p);
                }
            }
            return res;
        }
    }


