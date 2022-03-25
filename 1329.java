class Solution {
    public int[][] diagonalSort(int[][] mat) {
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for(int i =0 ; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                PriorityQueue<Integer> q = new PriorityQueue<>();
                int diff = i -j;
                map.putIfAbsent(diff, q);
                map.get(diff).add(mat[i][j]);
            }
        }
         for(int j = 0; j < mat.length; j++){
            for(int k =0; k < mat[j].length; k++){
                int diff = j-k;
                    mat[j][k]=map.get(diff).remove();
            }    
        }
        return mat;
    }
}
