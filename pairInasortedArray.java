import java.io.*; 
import java.util.*;
// Add any extra import statements you may need here


class Main {

  // Add any helper functions you may need here
  

  int countPairs(int[] arr, int k) {
    // Write your code here
    int sum = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < arr.length; i++){
      sum+= arr[i];
      map.put(arr[i], 0);
    }
    if( k > sum){
      return 0;
    }
    int count = 0;
   // 
    for(int i = 0; i < arr.length-1; i++){
        int complement = k - arr[i];
        if(map.containsKey(complement)){
          count++;
        }

    }
    
    //return map.size();
    return count/2;
  }
