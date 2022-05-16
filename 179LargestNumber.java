class Solution {
    public String largestNumber(int[] nums) {
        String num[] = new String[nums.length];
        
        for(int i =0; i < nums.length; i++){
            num[i] = String.valueOf(nums[i]);
        }
        //using comparator we are sorting the array in descending order
        Comparator<String> com = new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                String a1 = a+b;
                String b1 = b+a;     
                return b1.compareTo(a1);
            }
        };
        Arrays.sort(num, com);
      //array is in descending order so all the elements is less than the first 
        //element of the array after sorting, so if we get the first element is 0
        // we return 0 as that is the maximum element
            if(num[0].equals("0")){
                return "0";
            }
        
        
        StringBuilder sb = new StringBuilder();
        for(String r : num){
            sb.append(r);
        }
        return sb.toString();
        
    }
}
