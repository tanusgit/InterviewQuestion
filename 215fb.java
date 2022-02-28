class Solution {
  
  /*
  Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.
  */
    public int findKthLargest(int[] nums, int k) {
        //selection sort to sort the array
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
