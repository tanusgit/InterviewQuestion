package InterviewString;

import java.util.Stack;

public class Backspace {
    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
        boolean m = backspaceCompare(s, t);
        System.out.print(m);
    }

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c != '#'){
                stack.add(c);
            }
            else if(c == '#' && !stack.isEmpty()){
                stack.pop();
            }
        }


        Stack<Character> stack2 = new Stack<>();
        for(char c : t.toCharArray()){
            if(c != '#'){
                stack2.add(c);
            }
            else if(c == '#' && !stack2.isEmpty()){
                stack2.pop();
            }
        }

        String s1 = stack.toString();
        String s2 = stack2.toString();
        return s1.equals(s2);

    }
}
