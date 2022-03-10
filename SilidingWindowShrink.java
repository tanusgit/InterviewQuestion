package Practice;

public class SilidingWindowShrink {
    public static void main(String[] args) {
        //max subarray problem with a unfixed window size and a target value
        int a[] = {1, 2, 3, 4, 0, 1, 5, 8};
        int p = longestSubarray2(a, 3);
        System.out.println(p);
    }
//we are shrinking the window size from the left meaning start if we get the target sum
    private static int longestSubarray2(int[] a, int target) {
        int windowsmall = Integer.MAX_VALUE;
        int start = 0;
        int currentsum = 0;
        for(int end = 0; end < a.length; end++){
            currentsum += a[end];
            while(currentsum >= target){
                windowsmall = Math.min(windowsmall, end - start + 1);
                currentsum -= a[start];
                start++;
            }
        }
        return windowsmall;
    }
}
