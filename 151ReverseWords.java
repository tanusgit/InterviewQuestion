//151. Reverse Words in a String
class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        Stack<String> st = new Stack<>();
        
        for(int i =0; i < arr.length; i++){
            String e = arr[i];
            //there can be empty string too
            if(!e.equals(" ") && !e.equals("")){
                st.push(e);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop() + " ");
         
        }
        //to remove trailing space we need trim()
        return sb.toString().trim();
    }
}
