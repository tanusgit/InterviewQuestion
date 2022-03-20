class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int left = 0; int right = height.length - 1;
        int maxLeft = 0; int maxRight = 0;
        
        int totalWater = 0;
        while (left < right) {
            System.out.print("right = "+right + " left = "+left);
         if (height[right] < height[left]){
                if (height[right] >= maxRight) { 
                    maxRight = height[right]; 
                    right--;
                }else {
                    totalWater += maxRight - height[right]; 
                    right--;
                }
                //left++;
            } else {
                if (height[left] >= maxLeft) { 
                    maxLeft = height[left]; 
                    left++;;
                }else {
                    totalWater += maxLeft - height[left]; 
                    left++;
                }
                //right--;
            }
        }
        return totalWater;
    }
}


 
