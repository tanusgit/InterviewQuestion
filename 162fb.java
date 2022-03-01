/*
A peak element is an element that is strictly greater than its neighbors.

Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
  */




class Solution {
    public int findPeakElement(int[] nums) {
        Stack<Integer> st = new Stack<>();
        if(nums.length < 2){
            return 0;
        }
        int max = 0;
         for(int i = 1; i < nums.length; ){
            if(nums[i] > nums[i-1]){
                max = i;
                i++;
            }else{
                break;
            }
        }
        return max;
    }
}
