package interview1;

import java.util.ArrayList;

public class Stock {
	public static void main(String args[]) {
		int array[] = { 100, 180, 300, 400, 20, 100, 500 };
		int min;
		int max;
		int j = 1;

		keeping kip = new keeping(0, 0);

		ArrayList<keeping> arr = new ArrayList<keeping>();
		for (int l = 0; l < array.length - 1; l++) {
			while (array[l] < array[j]) {
				min = l;
				max = j;
				j++;
				kip.min = min;
				kip.max = max;
				arr.add(kip);
				//l = j+1;
				
			}
			if(array[l+1] < array[l]) {
				System.out.println("no profit");
			}
			else if(array[l+1] > array[l]) {
				kip.min = 0;
				kip.max = l+1;
			}
			
		}
		System.out.println(kip);
	}
}


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