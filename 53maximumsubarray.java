class Solution {
  /*  public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int total = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            total += nums[i];
            if(total < nums[i]){
                total = nums[i];      
            }else{
                total = total;
            }
            max = Math.max(total, max);
            
        }
        return max;
    }*/
    
  public static int maxSubArray(int[] nums) {
    int best=nums[0], total=nums[0];
    for (int i=1;i<nums.length;++i){
    	total= Math.max(total+nums[i],nums[i]);
    	best=Math.max(best, total);	
    }
    return best;
}
}

