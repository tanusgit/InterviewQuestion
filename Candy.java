package dataStructures;

import java.util.ArrayList;

public class Candy {
	public static void main(String[] args) {
		int a[] = distributeCandies(10, 3);
		for(int i = 0; i < a.length; i++) {
			System.out.println("index = "+ i + " " + a[i]);
		}
	}
		
		
	    static ArrayList<Integer> array = new ArrayList<>();
	   
	   
	    public static int[] distributeCandies(int candies, int num_people) {
	        // 10 candies 3 people
	    	int[] array = new int[num_people];
	    	 int left =0;
	    	 int sum = 0;
	    		/*for(int i = 0; i < num_people; i++){
	 	            array.add(candy);
	 	            candy++;
	 	        }
	    		for(int i =0; i < array.size(); i++) {
	    			count = count + array.get(i);
	    		}
	    		left = candies - count;
	    		// 1 2 3
	    		for(int i = 0; i < num_people; i++) {
	    			array.add(num_people+candy2);
	    			candy2++;
	    		}*/
	    	 int u =0;
	    	 for(int i = 0; i < num_people; i++) {
	    			array[i]= i + 1;
	    			sum = sum + array[i];	
	    			
	    		}
	    	 while(sum < candies) {
 				array[u] = sum + 1;
 						
 			}
	    		
	    		int i =0;
	    		while(candies != 0) {
	    			System.out.println(candies);
	    			array[i]=i + 1;
	    			if(candies == 0) {
	    				break;
	    			}
	    			i++;
	    			System.out.println(candies);
	    			candies--;
	    		}
	    	
	        return array;
	    }
	   
	
}
