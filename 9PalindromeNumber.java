class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        if(x < 0){
            return false;
        }
        while(x > 0){
            int p = x %10;
            sb.append(p);
            x = x /10;
        }
        System.out.println(sb.toString());
        return palindrom(sb.toString());
    }
    
    public boolean palindrom(String s){
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
