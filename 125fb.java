class Solution {
    public boolean isPalindrome(String s) {
        char arr[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        char sp = ' ';
        for(int i = 0; i < arr.length; i++){
            char c = arr[i]; 
            if(Character.isLetterOrDigit(c)){
                c = Character.toLowerCase(c);
                sb.append(c);   
            }
           // else if(c == sp ){
           //     continue;
           // }
         
        }
        String org = sb.toString();
        String rev = sb.reverse().toString();
        if(org.equals(rev)){
            return true;
        }else{
            return false;
        }
        
    }
}
