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
    //working
     public static boolean isUnique3(String s){
        HashSet<Character> set = new HashSet<>();
        for(int i =0; i < s.length(); i++){
            set.add(s.charAt(i));
        }
        if(s.length() == set.size()){
            return true;
        }
        return false;
    }
}
