package dataStructures;

import java.util.ArrayList;

public class Range {
	public static void main(String[] args) {
		int[][] array = {
				{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9 ,10, 11, 12}
            };
		ArrayList m = findSmallestRange(array, 5, 3);
		System.out.println(m);
		
		int smallest = (int) m.get(0);
		System.out.println(m.size());
		int n = m.size();
		System.out.println("smallest before " + smallest);
		for(int i =0; i < n; i++) {
			if(smallest > (int)m.get(i)) {
				smallest = (int)m.get(i);
			}
		}
		System.out.println(smallest);
		
		
	}

	static ArrayList<Integer> findSmallestRange(int[][] arr, int n, int k) {
		ArrayList<Integer> a = new ArrayList<>();
		int smallest = arr[0][0];
		for (int i = 0; i < k; i++) {
			
			a.add(arr[i][0]);
			}
			
			System.out.println(" ");
		

		return a;
	}
}
