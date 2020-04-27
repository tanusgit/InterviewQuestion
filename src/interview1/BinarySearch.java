package interview1;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int array[] = { 1, 4, 2, 6, 3, 8, 9, 11, 7, 12 };
		int target = 7;
		int left = 0;
		int right = array.length-1;
		int num = binarySearch(array, target, left, right);
		//should return 5
		System.out.println(num);
		
		
	}

	private static int binarySearch(int[] array, int target, int left, int right) {
		Arrays.sort(array);
		int mid = 0;
		int root = 0;
		//System.out.println(right);
		// int mid = array[0] + array[array.length-1];
		if (array.length % 2 != 0) {
			mid = (left + right+1) / 2;
		}
		else mid = (left + right) / 2;
		root = mid;
		
		//System.out.println(mid);
		if (array.length == 0) {
			return -1;
		} else if (target == array[left]) {
			return left;
		} else if (target == array[right]) {
			return right;
		} else if (target == array[mid]) {
			return mid;
		}
		else if (target < array[root]){
			int m = binarySearch( array, target, left, mid);
			return m;                               
		}
		else if (target > array[mid]){
			int s = binarySearch( array, target, mid, right);
			return s;              
		}
		else return 0;
	
	}
}
