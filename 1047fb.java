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
