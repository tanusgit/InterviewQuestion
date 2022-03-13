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
    with a minor optimazation
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
optimizing further
