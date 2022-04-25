package Practice;

public class MedianSortedArrays {
    public static void main(String[] args) {
        int a[] = {0, 0};
        int b[] = {0};
        double s = findMedianSortedArrays(a, b);
        System.out.print(s);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int len = n + m;
        int a[] = new int[len];
        int p1 = 0;//for nums1
        int p2 = 0;//for nums2
        int k = 0; //for a
        while(p1 < m && p2 < n){
            if(nums1[p1] < nums2[p2]){
                a[k] = nums1[p1];
                k++;
                p1++;
            }
            else{
                a[k] = nums2[p2];
                k++;
                p2++;
            }
        }
        while(p1 < m){
            a[k] = nums1[p1];
            k++;
            p1++;
        }
        while(p2 < n){
            a[k] = nums2[p2];
            k++;
            p2++;
        }
        double res = 0.0;
        if(len % 2 == 0){
            int mid = len /2;
            int mid2 = mid -1;
            System.out.println(a[mid] + " " + a[mid2]);
            res = (a[mid] + a[mid2]) / 2.0;
        }
        else if(len % 2 != 0){
            int mid = len /2;
            res = a[mid]/1.0;
        }
      
        return res;
    }
}
