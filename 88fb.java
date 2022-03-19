class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for(int i = m; i < nums1.length; i++){
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }
}


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //copying the first array
        int arr[] = new int[m];
        for(int i =0; i < m; i++){
            arr[i] = nums1[i];
        }
        
        int p =0;
        int j= 0;
        int k = 0;
        
        while(p < m+n && k < m && j <n){
            if(arr[k] < nums2[j]){
                nums1[p] = arr[k];
                p++;
                k++;
         
            }else{
                nums1[p] = nums2[j];
                j++;
                p++;
            }
        }
        while(j < n){
            nums1[p] = nums2[j];
            j++;
            p++;
        }
          while(k < m){
            nums1[p] = arr[k];
            k++;
            p++;
        }
         
    }
}
