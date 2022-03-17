
//need improvements
class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        HashMap< Integer, List<String>> map = new HashMap<>();
            List<List<String>> l = new ArrayList<>();
            List<String> kk = new ArrayList<>();
        
        for(int i = 0; i < strings.length; i++){
            if(map.containsKey(strings[i].length())){
                kk = map.get(strings[i].length());
                kk.add(strings[i]);
               }else{
                kk = new ArrayList<>();
                kk.add(strings[i]);
                map.put(strings[i].length(), kk);
            }
        }
        for(List<String> val : map.values()){
            l.add(val);
        }
        System.out.println(map);
        return l;
        
    }
    
    
    
}
// 10 test cases passed
