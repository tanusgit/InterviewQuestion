class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        ArrayList<Pair> l = numsol(mat);
     
        //keep all the week rows in an arrayList
        ArrayList<Pair> arr = new ArrayList<>();
        for(int i =0; i < l.size()-1; i++){
            Pair p = l.get(i);
            int solder = p.p;
            int row = p.s;
            
            Pair n = l.get(i+1);
            int soldern = n.p;
            int rown = n.s;
            //add the weak row
            if(soldern > solder){
                Pair w = new Pair(solder, row);
                arr.add(w);
            }else if(soldern == solder){
                if(row < rown){
                    Pair w1 = new Pair(solder, row);
                    arr.add(w1);
                }
            }    
            System.out.println("soldier = " + p.p + " row = " + p.s);
        }
        //trying to sort the array after making the array
        System.out.println("arr size" + arr.size());
        
        int a[][] = new int[k][2];
        for(int i =0; i < k; i++){
                //currently pair has solder, row
                Pair p = arr.get(i);
                a[i][0]= p.p;
                a[i][1] = p.s;
        }
        Arrays.sort(a, (x, y) -> x[0] - y[0]);
        int b[] = new int[k];
        for(int i =0; i < k; i++){
            b[i] = a[i][1];
        }
        
        return b;
    }
    //returns the number of soldiers in the each row
    public ArrayList<Pair>  numsol(int[][] mat){
        ArrayList<Pair> list = new ArrayList<>();
        for(int i =0; i < mat.length; i++){
            int count = 0;
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            Pair p = new Pair(count, i);
            list.add(p);  
        }
        return list;
    }
}

class Pair{
    int p;
    int s;
    public Pair(int p, int s){
        this.p = p;
        this.s = s;
    }
}
