class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        //sliding window with fixed size 3
        for(int i =0; i < s.length()-2; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(i));
            sb.append(s.charAt(i+1));
            sb.append(s.charAt(i+2));
            String str = sb.toString();
            if(isUnique2(str)){
                count++;
            }   
        }
        return count;
    }
    //this function needs modification
    public boolean isUnique(String s){
        int i =0;
        int j = s.length()-1;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
    
      public boolean isUnique2(String s){
        
      if(s.charAt(0) != s.charAt(1)){
          if(s.charAt(0) != s.charAt(2)){
              if(s.charAt(1) != s.charAt(2)){
                  return true;
              }
          }
      }
        return false;
    }
}
