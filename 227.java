class Solution {
    public int calculate(String s) {
        int ans = 0;
        int num = 0;
        s = s+ '+';
        Stack<Integer> st = new Stack<>();
        char arr[] = s.toCharArray();
       char sign = '+';
        for(char c : arr){
            if(Character.isDigit(c)){
                num = (10*num)+(c-'0');
            }else if(c != ' ')
            {
                if(sign == '+'){
                    st.push(num);
                }
                else if(sign == '-'){
                    st.push(-1*num);
                }
                else if(sign == '*'){
                    st.push(st.pop()*num);
                }
                else if(sign == '/'){
                    st.push(st.pop()/num);
                }
                
                num = 0;
                sign = c;
                
            }
        }
        while(!st.isEmpty()){
            ans = ans+ st.pop();
        }
        return ans;
    }

}
