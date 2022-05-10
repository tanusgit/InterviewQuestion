  public String longestCommonPrefix(String[] strs) {
        String r = strs[0];
        for(int i =1; i < strs.length; i++){
            while(strs[i].indexOf(r) != 0){
                r = r.substring(0, r.length()-1);
              
            }    
        }
        if(r.isEmpty()){
                return "";
            }else{
                  return r;
            }
       
    }
