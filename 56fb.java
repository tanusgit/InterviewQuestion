class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 1){
            return intervals;
        }
        Arrays.sort(intervals, (x, y) -> x[0] -y[0]);
        ArrayList<int[]> list = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            int a = intervals[i][0];
            int b = intervals[i][1];
            if(end >= a){
                end = Math.max(end, b);
            }else{
                int c[] = {start, end};
                list.add(c);
                start = a;
                end = b;
            }
        }
          int[] arr = {start, end};
          list.add(arr);
        int[] arr2 = {start, end};
        int res[][] = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++){
            int arr3[] = new int[2];
            for(int j = 0; j < 2; j++){
                res[i][j] = list.get(i)[j];
            }
        }
        return res;
    }
}
