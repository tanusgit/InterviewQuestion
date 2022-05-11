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

//another solution

   public void rotate(int[][] mat) {
        HashMap<Integer, Stack<Integer>> map = new HashMap<>();
        
        for(int i =0; i < mat.length; i++){
            Stack<Integer> st = new Stack<>();
            for(int j =0; j < mat[0].length; j++ ){
                st.push(mat[j][i]);
            }
            map.put(i, st);
        }
         
        for(int i =0; i < mat.length; i++){
            for(int j =0; j < mat[0].length; j++ ){
                mat[i][j] = map.get(i).pop();
            }
        }
        
    }
