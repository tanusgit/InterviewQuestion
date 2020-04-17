package interview1;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int array[] = { 1, 4, 2, 6, 3, 8, 9, 11, 7, 12 };
		int target = 8;
		int left = array[0];
		int right = array[array.length-1];
		int num = binarySearch(array, target, left, right);
		//should return 5
		System.out.println(num);
		
	}

	private static int binarySearch(int[] array, int target, int left, int right) {
		Arrays.sort(array);
		left = 0;
		right = array.length-1;
		//System.out.println(right);
		// int mid = array[0] + array[array.length-1];
		int mid = (left + right+1) / 2;
		System.out.println(mid);
		if (array.length == 0) {
			return -1;
		} else if (target == array[left]) {
			return left;
		} else if (target == array[right]) {
			return right;
		} else if (target == array[mid]) {
			return mid;
		}
		/*else{
			binarySearch( array, target, array[0], array[mid]);
		}*/
		else return 0;
	}
}
