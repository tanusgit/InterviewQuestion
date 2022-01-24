package Practice;

public class StringCompression1 {
    public static void main(String[] args) {
        String s = "aaabbbccc";
        String res = compress(s);
        System.out.println(res);
    }
    public static String compress(String s ){
        StringBuilder res = new StringBuilder();
        int num = 0;
        for(int i = 0; i < s.length();){
            char c = s.charAt(i);
            for(int j = i; j < s.length(); j++) {
                if(c == s.charAt(j)){
                    num++;
                }
            }
            i = i + num;
            res.append(c);
            res.append(num);
            num = 0;
        }
        return res.toString();
    }
}
