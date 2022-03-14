class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length < 2){
            return false;
        }
      
        int sum = 0;
        
        for(int i : nums){
            sum+= i;
        }
        int zero = 0;
        Stack<Integer>st = new Stack<>();
        st.push(nums[0]);
        for(int i =1; i < nums.length; i++){
            if(!st.isEmpty() && st.peek() == 0 && nums[i] == 0){
                st.push(nums[i]);
            }else if(!st.isEmpty() && st.peek() == 0 && nums[i] != 0){
                st.pop();
            }else if(!st.isEmpty() && st.peek() != 0 && nums[i] == 0){
                st.push(nums[i]);
            }
        }
        
        for(int i =0; i < st.size(); i++){
            if(!st.empty()){
                if(st.pop() == 0){
                    zero++;
                }
            }
        }
    //checking if we get 2 contiguous 0's in the array
        if(zero >= 2){
            return true;
        }
       
        int currsum = 0;
        int jsum = 0;
        int left = 0;
        int windowsize = 0;
        
        for(int i = 0; i < nums.length; i++){
            currsum += nums[i];
            windowsize++;
            if(currsum % k == 0 && windowsize >=2){
                return true;
            }
        }
        int window = 0;
        for(int i = nums.length-1; i >=0; i--){
            jsum += nums[i];
            window++;
            if(jsum % k == 0 && window >=2){
                return true;
            }
        }
        if(sum % k != 0){
            return false;
        }
        
        return true;
    }
}
//passed 84/95 test cases
