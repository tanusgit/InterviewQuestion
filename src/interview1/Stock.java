package interview1;

import java.util.ArrayList;

public class Stock {
	
	public static void main(String args[]) {
		Stock stock = new Stock();

		// stock prices on consecutive days
		int price[] = {7, 5, 2, 1 };
		int n = price.length;

		// fucntion call
		stock.sellbuy(price, n);
	}
	void sellbuy(int price[], int n) {
		// Prices must be given for at least two days
		if (n == 1)
			return;
		int count = 0;
		// solution array
		ArrayList<Keep> array = new ArrayList<Keep>();
		int i = 0;
		while (i < n - 1) {
			System.out.println("inside first while loop " + i);
			while ((i < n - 1) && (price[i + 1] <= price[i])) {
				i++;
				System.out.println("decreasing " + i);
			}
			if (i == n - 1)
				break;
			Keep e = new Keep();
			e.min = i;
			i++;
		
			while ((i < n) && (price[i] >= price[i - 1])) {
				i++;
				System.out.println("increasing " + i);
			}
			// Store the index of maxima
			e.max = i - 1;
			array.add(e);
			
			count++;
		}//end of loop
		
		
		
		if (count == 0)
			System.out.println("There is no day when buying the stock " + "will make profit");
		else
			for (int j = 0; j < count; j++)
				System.out.println("Buy on day: " + array.get(j).min + "        " + "Sell on day : " + array.get(j).max);

		return;
	}
	
	class Keep{
		int min; int max;
	}
}




