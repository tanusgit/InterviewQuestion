class Solution {
    public int romanToInt(String s) {    
        HashMap<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        
        int res = 0;
        int num = 0;
        
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            char c = s.charAt(i);
            if(!st.isEmpty() && st.peek() == 'I' ){
                if( c == 'V'){
                    res = res + m.get(c) - m.get('I');
                    st.pop();
                }
                else if(c == 'X'){
                    res = res + m.get(c) - m.get('I');
                    st.pop();
                }
                else{
                    st.push(c);
                }
            }
            else if(!st.isEmpty() && st.peek() == 'C' ){
                if( c == 'D'){
                    res = res + m.get(c) - m.get('C');
                    st.pop();
                }
                else if(c == 'M'){
                    res = res + m.get(c) - m.get('C');
                    st.pop();
                }
                else{
                    st.push(c);
                }
            }
            else if(!st.isEmpty() && st.peek() == 'X' ){
                if( c == 'L'){
                    res = res + m.get(c) - m.get('X');
                    st.pop();
                }
                else if(c == 'C'){
                    res = res + m.get(c) - m.get('X');
                    st.pop();
                    
                }
                else{
                    st.push(c);
                }
            }
            else{
                  st.push(c);
            }
        }
        while(!st.isEmpty()){
            num += m.get(st.pop());
        }
            num = num + res;
        return num;
    }
}
