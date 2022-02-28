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


//using selection sort insetead of javas inbuilt sort function

class Solution {
    public int findKthLargest(int[] nums, int k) {
        //selection sort to sort the array
        
       // Arrays.sort(nums);
        selectionsort(nums);
        return nums[nums.length-k];
    }
    
    public void selectionsort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int min = i;
            for(int j = i+1; j < arr.length; j ++){
                if(arr[min]> arr[j]){
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
