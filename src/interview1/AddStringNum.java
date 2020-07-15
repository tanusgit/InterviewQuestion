package interview1;

import java.util.ArrayList;

/*
 * Input: two strings which are numbers
 * Output: sum of two numbers as string
 * e.g., a = "589", b = "784"
 * output return the sum as a string: "1373"
 */
public class AddStringNum {
	public static void main(String[] args) {
		String a = "27";
		String b = "35";
	
		add2(a,b);
		/*
		 * 0 = 48	4 = 52	8 = 56
		 * 1 = 49	5 = 53	9 = 57
		 * 2 = 50	6 = 54	10 = 58
		 * 3 = 51	7 = 55  n-1 is first value
		 */
		char c = a.charAt(a.length()-1);
		char c2 = b.charAt(b.length()-1);
		
		char c3 = a.charAt(a.length()-2);
		char c4 = b.charAt(b.length()-2);
		//System.out.println(c);
		
		int FirstDigit = (int)c;
		int SecondDigit =(int)c2;
		
		System.out.println(FirstDigit);
		System.out.println(SecondDigit);
		
		int resFirst = c - '0';
		int resSecond = c2 - '0';
		int res3 = c3 - '0';
		int res4 = c4 - '0';

		int res = resFirst +  resSecond;
		System.out.println(res);
		int res2 = res3 +  res4;
		System.out.println(res2);

		int result = res2*10+res;
		System.out.println(result);
		int two = (int)2;
		//System.out.println(two);
		//add(a, b);
		
	}

	private static void add(String a, String b) {
		// add two integer
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		int res = a1 + b1;
		System.out.println(res);

	}
	private static void add2(String a, String b) {
		// add two integer
		//int finalres = 0;
		for(int i = a.length(); i >= 0; i++) {
			char a1 = a.charAt(i);
			char b1 = b.charAt(i);
			
			int r1 = a1 - '0';
			int r2 = b1 -'0';
			
			int res = r1 + r2;
			ArrayList<Integer> nums = new ArrayList<>();
			nums.add(res);
			
			int finalres = nums.get(0)*10+nums.get(1);
			
			
			System.out.println(finalres);
			
			
			
		}

	}
}
