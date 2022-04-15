package Practice;

import java.util.HashSet;

public class Bivalued {
    public static void main(String[] args) {
    //Find longest length bi-valued slice in an array in java
        int a[] = { 2 , 2 , 3 , 3 , 3 , 4 , 5 , 5, 4};
        int a1[] = { 2 , 2 , 3 , 3 , 3 , 4 };
        int b = bivalued(a);
        System.out.println(b);
    }


        public static int bivalued(int[] arr) {
            int res = 0;
            if(arr.length == 0){
                return 0;
            }
            int lastseen = -1;
            int secondlastseen = -1;
            int count = 0;
            int count2 = 0;
            for(int i = 0; i < arr.length; i++){
                int num = arr[i];
                if(num == lastseen || num == secondlastseen){
                    count++;
                }else{
                    count = count2 +1;
                }
                if(num == lastseen){
                    count2++;
                }else{
                    count2 = 1;
                    secondlastseen = lastseen;
                    lastseen = num;
                }
                res = Math.max(count, res);
            }
            return res;
        }
    }

