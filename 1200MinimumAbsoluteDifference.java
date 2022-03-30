//1200. Minimum Absolute Difference

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        int minabs = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i =0; i < arr.length-1; i++){
            int p = Math.abs(arr[i] - arr[i+1]);
            if(minabs > p){
                minabs = p;
            }
        }
       /* for(int i =0; i < arr.length-1; i++){
            for(int j =i+1; j < arr.length; j++){
                if(Math.abs(arr[i] - arr[j]) == minabs){
                List<Integer> newl = new ArrayList<>();
                newl.add(arr[i]);
                newl.add(arr[j]);
                list.add(newl);
            }
        }
    }*/
       int i =0;
       int j = i+1;
       while(j < arr.length){
            if(Math.abs(arr[i] - arr[j]) == minabs){
                List<Integer> newl = new ArrayList<>();
                newl.add(arr[i]);
                newl.add(arr[j]);
                list.add(newl);   
            }
           i++;
           j++;
        }
        return list;
        
    }
}
