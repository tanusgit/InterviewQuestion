class Solution {
    public int romanToInt(String s) {
     
            
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int res = 0;
        int num = 0;
        
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i =0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!st.isEmpty() && c == 'L'){
                if(st.peek() == 'X'){
                    num = map.get(c) - map.get('X');
                    st.pop();
                }
            }
            else if(!st.isEmpty() && c == 'C'){
                if(st.peek() == 'X'){
                    num = map.get(c) - map.get('X');
                    st.pop();
                }
            }
            else if(!st.isEmpty() && c == 'V'){
                if(st.peek() == 'I'){
                    num = map.get(c) - map.get('I');
                    st.pop();
                }
            }     //CD = 400 CM = 900
            else if(!st.isEmpty() && c == 'D'){
                if(st.peek() == 'C'){
                    num = map.get(c) - map.get('C');
                    st.pop();
                }
            }
             else if(!st.isEmpty() && c == 'M'){
                if(st.peek() == 'C'){
                    num = map.get(c) - map.get('C');
                    st.pop();
                }
            }
            else{
                st.push(c);
            }
            
            res = res + num;
            System.out.println("num = " + num + " res = " +res);
        }
        System.out.println(st.toString());
        while(!st.isEmpty()){
            res = res + map.get(st.pop());
        }
  
        return res;
    }
}
