package dataStructures;

public class EachCandy {
	public static void main(String[] args) {
		int candy = 10;
		int man = 3;
		int[] num = HowmanyCandy(candy, man);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}
//everyone should get one candy each time
	private static int[] HowmanyCandy(int candy, int man) {
		int[] NumCandy = new int[man];
		int give = 0;
		int sum = 0;
		int p =0 ;
		int left = candy;
		
		while(left > 0) {
			
			for(int i = 0; i < man; i++) {
				if(left <= 0) {
					break;
				}
				
				NumCandy[i] += 1;
				give++;
				System.out.println("total give in for loop " + give);
				left = candy - give;
			}
			
			System.out.println("left " + left);
			
		}
		
		return NumCandy;
	}
}
