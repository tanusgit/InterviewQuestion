class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int count = 0;
        for(int i =0; i < nums.length-1; i++){
            if(nums[i] >0 && nums[i+1] > i+ nums[i]){
                len =  len -1;
                count++;
            }else{
                len = len - nums[i];
                count++;
            }
        }
        if(len <= 1){
            return true;
        }
        return false;
    }
}
