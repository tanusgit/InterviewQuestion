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
//another solution
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i); 
            if(Character.isLetterOrDigit(c)){
                c = Character.toLowerCase(c);
                sb.append(c);   
            }
        }
        String p = sb.toString();
        return valid(p);
        
        
    }
    
    public boolean valid(String s){
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}
