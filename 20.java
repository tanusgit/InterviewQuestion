class Solution {
    public boolean isValid(String s) {
       char arr[] = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            char c = arr[i];
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }
            else if(c == ')' || c == '}' || c == ']'){
                if(c == ')' && !st.isEmpty()){
                    if(st.peek() == '('){
                        st.pop();
                    }else{
                        return false;
                    }
                }
                else if(c == '}' && !st.isEmpty()){
                    if(st.peek() == '{'){
                        st.pop();
                    }else{
                        return false;
                    }    
                }
                else if(c == ']' && !st.isEmpty()){
                    if(st.peek() == '['){
                        st.pop();
                    }else{
                        return false;
                    }
                }//we need to see if we have any  open parantheses in the stack or not as we only
                //push open paran to the stack if we do not have any element that means we never got 
                //an open paran and the string is invalid
                else if(st.isEmpty()){
                    return false;
                }
            }
           
            
        }
        System.out.print(st);
        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
        
    }
}
