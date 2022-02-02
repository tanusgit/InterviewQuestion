package Teacher;

public class StringAdd {
    public static void main(String[] args) {
        String s = "123";
        String s1 = "29"; // 152
        String res = Add(s, s1);
        System.out.println(res);

    }
    public static String Add(String s, String s1){
        int p1 = s.length()-1;
        int p2 = s1.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(p1 >=0 || p2 >=0){
            int x = p1 >= 0 ? s.charAt(p1) - '0' : 0;
            int y = p2 >= 0 ? s1.charAt(p2) -'0' : 0;
            //first calculate value then we get the carry
            int value = (x + y + carry) % 10;
            carry = (x + y + carry) / 10;
            sb.append(value);
            p1--;
            p2--;
        }
        return sb.reverse().toString();
    }
}
