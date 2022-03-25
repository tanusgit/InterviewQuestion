class Solution {
    public void rotate(int[][] mat) {
        int col = mat[0].length;
        int row = mat.length;
       
        HashMap<Integer, Stack<Integer>> map = new HashMap<>();
        for(int i =0; i <col; i++){
            Stack<Integer> m = new Stack<>();
            for(int j = 0; j < row; j++){
                m.push(mat[j][i]);
                map.put(i, m);
            }
           
        }
        System.out.println(map);
        
        for(int i =0; i < row; i++){
            for(int j =0; j < col; j++){
                if(!map.get(i).isEmpty()){
                     mat[i][j]= map.get(i).pop();
                }
               
            }
        }
        
        
    }
}
