class Solution {
    public int expressiveWords(String s, String[] words) {
        //need to know which letter came atleast 3 times in the string
        HashMap<Character, Integer> map = new HashMap<>();
            int val = 1;
        for(int i =0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c, val);
            }else{
                map.put(c, map.get(c)+1);
            }
        }
        
        //we can only perform operation on those characters which has value >= 3
        //we will save them in an hashmap
         HashMap<Character, Integer> map2 = new HashMap<>();
        for(Map.Entry<Character, Integer> m : map.entrySet()){
            Character c = m.getKey();
            int val2 = m.getValue();
            if(val2 >= 3){
                  map2.put(c, 0);
            }  
        }
        //we can do the transformation on the characters inside map2
        //create hashmap for every word in the array
        //check if all the characters of the hashmap are same for the given string and hashmap 
        //if not we cannot perform transformation on the string
        ArrayList<HashMap<Character, Integer>> list = new ArrayList<>();
        for(int i =0; i < words.length; i++){
            String s1 = words[i];
            HashMap<Character, Integer> m1 = new HashMap<>();
            for(int j =0; j < s1.length(); j++){
                m1.put(s1.charAt(j), 0);
            }
            list.add(m1);
        }
        System.out.println(list.get(2));
        return 0;
    }
}
