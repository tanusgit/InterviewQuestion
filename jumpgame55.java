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


///another working solution
public boolean canJump(int[] A) {
       //example array 3, 2, 1, 0, 4 returns false
       //the idea here is the maximum steps we can take is 3 which is stored in
       //the max variable but i became 4 at the end of the array means we cannot
       //reach to the end of the array with  our maximum steps and that is why when 
       //i became more than the maximum steps we return false
    int max = 0;
    for(int i=0;i<A.length;i++){
        if(i>max) {
            return false;
        }
        max = Math.max(A[i]+i,max);
    }
    return true;
}
