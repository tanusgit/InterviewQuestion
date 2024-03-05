package interview1;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 5, 6, 8, 9};
		int target = 5;
		int left = 0;
		int right = array.length-1;
		int num = binarySearch2(array, target, left, right);
		//should return 5
		System.out.println(num);
		
		
	}

	public static int binarySearch(int arr[], int t, int l, int r){
		while(l <= r){
			int mid = l + r-l /2;

			if(arr[mid] == t){
				return mid;
			}
			if(arr[mid] < t){
				l = mid + 1;
			}else{
				r = mid -1;

			}
		}
		return -1;
	}


	public static int binarySearch2(int arr[], int t, int l, int r){
		if(l <= r){
			int mid = l + r-l /2;

			if(arr[mid] == t){
				return mid;
			}
			if(arr[mid] < t){
				return binarySearch2(arr, t, mid+1, r);
			}else{
				return binarySearch2(arr, t, l, mid-1);

			}
		}
		return -1;
	}
}