package interview1;

import java.util.ArrayList;

public class Stock2 {
	public static void main(String args[]) {
		// stock prices on consecutive days
		int price[] = { 7, 5, 2, 1 };
		int n = price.length;

		// fucntion call
		stocking(price, n);
	}

	public static void stocking(int arr[], int n) {
		n = arr.length;
		boolean increasing = true;
		boolean decreasing = true;
		int count = 0;
		ArrayList<Putting> m = new ArrayList<Putting>();
		Putting p  = new Putting();
		if(n == 1) {
			return;
		}
		for (int i = 1; i < n-1;) {
			if(arr[i+1] > arr[i]) {
				p.min = i;
				i++;
			}
			
			else if(arr[i-1] < arr[i]) {
				i++;
				p.max = i;
				
			}
			
		}
		m.add(p);
	}

	
}
class Putting {
	int min, max;
	public String toString() {
		String res;
		return res = min + " " + max;
	}
}
