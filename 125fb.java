class Solution {
    public boolean isPalindrome(String s) {
        char arr[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        char sp = ' ';
        for(int i = 0; i < arr.length; i++){
            char c = arr[i]; 
            if(Character.isAlphabetic(c)){
                c = Character.toLowerCase(c);
                sb.append(c);   
                System.out.println(sb);
            }
            else if(c == sp ){
                continue;
            }
            //else if(Character.isDigit(c)){
               // continue;
           // }
        }
        String org = sb.toString();
        String rev = sb.reverse().toString();
        System.out.println(org + "  " + rev);
        if(org.equals(rev)){
            return true;
        }else{
            return false;
        }
        
    }
}
