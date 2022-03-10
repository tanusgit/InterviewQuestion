package Practice;

public class SlidingWindow {
    public static void main(String[] args) {
        //max subarray problem with a fixed window size
        int a[] = {1, 2, 3, 4, 0, 1, 5, 8};
        int p = longestSubarray(a, 3);
        System.out.println(p);
    }

    public static int longestSubarray(int[] a, int window) {
        int maxsum = 0;
        int currentsum = 0;
        for(int i = 0; i < a.length; i++){
            currentsum += a[i];
            //window -1 gives the correct window size as the index starts with 0
            if(i >= window-1){
                maxsum = Math.max(maxsum, currentsum);
                currentsum -= a[i-(window - 1)];
            }
        }
        return maxsum;
    }

}
