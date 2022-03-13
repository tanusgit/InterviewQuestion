class Solution{
    
    public boolean validPalindrome(String s) {
       // HashMap<Boolean, Integer> map = new HashMap<>();
       // boolean r = false;
        for(int i =0; i < s.length(); i++){
            String res = makestr(s, i);
            boolean b = valid(res);
            boolean c = valid(s);
            if(b == true || c == true){
                return true;
            }
          //  map.put(b, 0);
        }
        //System.out.print(map);
      /*  if(map.containsKey(true)){
            r = true;;
        }
        else{
            r = false;
        }
        return r;*/
        return false;
    }
    
    public boolean valid(String s) {
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
    
    public String makestr(String s, int k){
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < s.length(); i++){
            if(i == k){
                continue;
            }
            sb.append(s.charAt(i)); 
        }
        return sb.toString();
    }
}
................................................................
   // with a minor optimazation
    class Solution{
    
    public boolean validPalindrome(String s) {
       // HashMap<Boolean, Integer> map = new HashMap<>();
       // boolean r = false;
        for(int i =0; i < s.length(); i++){
            String res = makestr(s, i);
            boolean b = valid(res);
            boolean c = valid(s);
            if(b == true || c == true){
                return true;
            }
          //  map.put(b, 0);
        }
        //System.out.print(map);
      /*  if(map.containsKey(true)){
            r = true;;
        }
        else{
            r = false;
        }
        return r;*/
        return false;
    }
    
    public boolean valid(String s) {
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
    
    public String makestr(String s, int k){
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < s.length(); i++){
            if(i == k){
                continue;
            }
            sb.append(s.charAt(i)); 
        }
        return sb.toString();
    }
}
-------------------------------------------
//optimizing further for passing all test cases
    //It will only make 2 string instead of making all the string by dropping one character one by one
    //if both the string is not palindrome then the entire string is not a palindrome
class Solution{
    
    public boolean validPalindrome(String s) {
            int p[] = valid(s);
            if(p[0] == -1){
                return true;
            }else{
                int k = p[0];
                int r = p[1];
                String res = makestr(s, k);
                String res2 = makestr(s, r);
                boolean b = valid2(res);
                boolean c = valid2(res2);
                if(b == true || c == true){
                return true;
                }else{
                    return false;
                }
                
            }
           //  return false;
          
        }
      
    
    public int[] valid(String s) {
        int a[] = new int[2];
        //b means the palindrome is valid
        int b[] = {-1, -1};
        int i = 0;
        int j = s.length()-1;    
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                a[0] = i;
                a[1] = j;
                return a;
            }else{
                i++;
                j--;
            }  
        }
        return b;
    }

  public boolean valid2(String s) {
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
    
    public String makestr(String s, int k){
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < s.length(); i++){
            if(i == k){
                continue;
            }
            sb.append(s.charAt(i)); 
        }
        return sb.toString();
    }
}
