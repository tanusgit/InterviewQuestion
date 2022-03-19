class Solution {
    public String removeDuplicates(String s) {
        return unique(s);
    }
    //idea here is to push adjacents elemnts which are not same
    //if they are same we pop the element
    public String unique(String s){
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(!st.isEmpty() && st.peek() != s.charAt(i)){
                st.push(s.charAt(i));
            }
            else if(!st.isEmpty() && st.peek() == s.charAt(i)){
                    st.pop();
            }
            else{
                 st.push(s.charAt(i));
            }
           
        }
        String res = "";
        for(char i : st ){
            res+= i;
        }
        return res;
           
      
    }
}
//another solution
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i =0; i< s.length(); i++){
            char c = s.charAt(i);
            if(!st.isEmpty() && st.peek() == c ){
                st.pop();
            }else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
           sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
