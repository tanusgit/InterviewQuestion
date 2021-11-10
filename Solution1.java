package FirstFivequestions;
/*
public static boolean palindrome(String s ){
        int i = 0, j = s.length() - 1;
        while (i < j) {
        if (s.charAt(i) != s.charAt(j))
        return false;
        i++;
        j--;
        }
        return true;
        }*/
import java.util.*;
class rgb {
    int r;
    int g;
    int b;
    public void rgb() {
        r = 0;
        g = 0;
        b = 0;
    }
    public void addR() {
        r += 1;
    }
    public void addG() {
        g += 1;
    }
    public void addB() {
        b += 1;
    }
    public String toString() {
        return "R:" + r + ", G:" + g + ", B:" + b;
    }
}

public class Solution1 {
    public static void main(String[] a) {
        int res = sol("B2R5G2R2");
       // System.out.println("Result: " + res);
    }
    public static int sol(String s) {
        int l = s.length();
        HashMap<Integer, rgb> map = new HashMap();
        for (int i = 0; i < 10; ++i)
            map.put(i, new rgb());
        int res = 0;
        for (int i = 0; i < l; i+=2) {
            char col = s.charAt(i);
            int rod = s.charAt(i+1) - '0';
            System.out.println("col, rod = " + col + ", " + rod);
            if (col == 'R')
                map.get(rod).addR();
            if (col == 'G')
                map.get(rod).addG();
            if (col == 'B')
                map.get(rod).addB();
        }
        for (int i = 0; i < 10; ++i) {
            rgb r = map.get(i);
            int m = Math.min(Math.min(r.r, r.g), r.b);
            res += m;
            System.out.println("Printing: " + i + ": " + map.get(i));
        }
        return res;
    }
}
