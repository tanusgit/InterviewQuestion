package interview1;

import java.util.ArrayList;

public class Stock {
	public static void main(String args[]) {
		int array[] = { 100, 180, 300, 400, 20, 100, 500 };
		int min;
		int max;
		int j = 1;
		keeping kip = new keeping(0, 0);
		;
		// keeping kip2 = new keeping(4,5);
		// System.out.println(kip2);
		ArrayList<keeping> arr = new ArrayList<keeping>();
		for (int l = 0; l < array.length - 1; l++) {
			while(l<j) {
				
				j++;
			}
			System.out.println(kip);
		}
		

	}
}
/*
 * for (int i = 1; i < array.length - 1; i++) {
				if (array[l] < array[i]) {
					min = l;
					max = i;
					kip.min = min;
					kip.max = max;
					arr.add(kip);
				}
			}
 */

class keeping {
	int min;
	int max;

	keeping(int a, int b) {
		min = a;
		max = b;
	}

	public String toString() {
		String res = "min = " + min + ", max =  " + max;
		return res;
	}
}