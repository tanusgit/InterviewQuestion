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
  
  
  import java.io.*; 
import java.util.*;
// Add any extra import statements you may need here


class Main {

  // Add any helper functions you may need here
  

  int countPairs(int[] arr, int k) {
    // Write your code here
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
      sum+= arr[i];
    }
    if( k > sum){
      return 0;
    }
    int count = 0;
   
    int p = 0;
    int p2 = arr.length-1;
    while(p < p2){
      if(arr[p]+arr[p2] == k){
        count++;
        p++;
        p2--;
      }else if(arr[p]+arr[p2] > k){
        p2--;
      }else if(arr[p]+arr[p2] < k){
        p++;
      }
    }
    return count;
  }

/*
You are given an array
arr of size N. Find the number of all unique pairs in the array that sum to a number k. The elements of the array are distinct and are in sorted order
*/








