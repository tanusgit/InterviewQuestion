class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i < nums.length; i++){
            map.put(nums[i], 0);
        }
        if(nums.length > map.size()){
            return true;
        }
        return false;
        
    }
}
