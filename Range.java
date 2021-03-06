package dataStructures;

class Range{ 
  
    // Driver program to test above function 
    public static void main(String[] args) 
    
    { 	/*int mind = 0;
    int ro[] = new int[3];
    	while(mind < 5) {
    	
    	
    	for(int i = 0; i < 3; i++) {
    		ro[i] = 0;
    	}
    	ro[mind]++;
    }
    	System.out.println("printing ro" );
    	for(int i = 0; i < 3; i++) {
    		//System.out.println(ro[i]);
    	}
  */
        int arr[][] = { 
            { -1, 5, 7, 12 }, 
            { 0, 8, 10, 14 }, 
            { 4, 11, 16, 17 } 
        }; 
        int sum = 0;
        int row = 0;
        for(int i[] : arr) {
        	row ++;
        	for(int j : i) {
        		sum++;
        	}
        }
        int l = sum/row;
        System.out.println(l);
        int k = arr.length; 
        
        findSmallestRange(arr, 4, k); 
    }
  //static final int N = 4; 

// array for storing the current index of list i 
static int ptr[] = new int[501]; 

// This function takes an k sorted lists in the form of 
// 2D array as an argument. It finds out smallest range 
// that includes elements from each of the k lists. 
static void findSmallestRange(int arr[][], int n, int k) 
{ 
    int i, minval, maxval, minrange, minel = 0, maxel = 0, flag, minind; 

    // initializing to 0 index; 
    for (i = 0; i <= k; i++) { 
        ptr[i] = 0; 
    } //ptr[1] = 0; ptr[2]=0; ptr[3]=0;

    minrange = Integer.MAX_VALUE; 

    while (true) { 
        // for mainting the index of list containing the minimum element 
        minind = -1; 
        minval = Integer.MAX_VALUE; 
        maxval = Integer.MIN_VALUE; 
        flag = 0; 

        // iterating over all the list 
        for (i = 0; i < k; i++) { 
            // if every element of list[i] is traversed then break the loop 
        	System.out.println("printing  ptr[i]  = "+ ptr[i] + " and n = "+ n );
            if (ptr[i] == n) { 
                flag = 1; 
                break; 
            } 
            // find minimum value among all the list elements pointing by the ptr[] array 
            if (ptr[i] < n && arr[i][ptr[i]] < minval) { 
                minind = i; // update the index of the list 
                minval = arr[i][ptr[i]]; 
                System.out.println("printing inside minval arr[i][ptr[i]] = "+ arr[i][ptr[i]]);
            } 
            // find maximum value among all the list elements pointing by the ptr[] array 
            if (ptr[i] < n && arr[i][ptr[i]] > maxval) { 
                maxval = arr[i][ptr[i]]; 
                System.out.println("printing  inside maxval arr[i][ptr[i]] = "+ arr[i][ptr[i]]);
            } 
        }
        System.out.println(" ");
        System.out.println("after for loop");
        System.out.println(" ");
        // if any list exhaust we will not get any better answer, so break the while loop 
        if (flag == 1) { 
            break; 
        } 

        ptr[minind] = ptr[minind]+1; 

        // updating the minrange 
        if ((maxval - minval) < minrange) { 
            minel = minval; 
            maxel = maxval; 
            minrange = maxel - minel; 
        } 
    }  
    System.out.printf("The smallest range is [%d, %d]\n", minel, maxel); 
} 
}
