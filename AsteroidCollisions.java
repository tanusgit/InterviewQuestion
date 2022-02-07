class Solution {
    public int[] asteroidCollision(int[] ast) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> ind = new Stack<>();
        //4 possible conditions
        //if both positive , if both negative just put them on the stack
        //if first moves left and 2nd moves right nothing happens
        //if 1st moves right and 2nd moves left they collide
        for(int i =0; i < ast.length; i++){
            if(ast[i] > 0){
                st.push(ast[i]);
                ind.push(i);
            }else{
                while(!st.isEmpty() && -ast[i] > st.peek()){
                    st.pop();
                    ind.pop();
                }
                if(!st.isEmpty() && st.peek() == -ast[i]){
                    st.pop();
                    ind.pop();
                }
                else if(st.isEmpty()){
                    st.push(ast[i]);
                    ind.push(ast[i]);
                }
                
            }
        }
        int a [] = new int[st.size()];
        int i = st.size()-1;
        while(!st.isEmpty()){
            a[i]= st.pop();
            i--;
        }
        return a;
        
    }
}
