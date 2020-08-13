package interview1;

import java.lang.reflect.Array;

public class StringNum {
	public static void main(String[] args) {
		String str = "123";
		String str1 = "5";
		// 268 168
		int t = '0' - '0';
System.out.println(t);
		String res = add(str, str1);
		System.out.println(res);
	}

	public static String add(String a, String b) {
		StringBuilder result = new StringBuilder();
		int carry = 0;
		int sum = 0;

		
		StringBuilder b1 = new StringBuilder(b);
		
		int max = Math.max(a.length(), b1.length()); 
		System.out.println("max = "+ max);
		
		if(a.length() > b.length()) {
			int temp = a.length();
		
			
		}
			// converting String to StringBuilder
			int len = b.length();
			b1.setLength(a.length());
			
			for (int i = b1.length() - 1; i >= len; i--) {
				b1.setCharAt(i, '0'); 
				
			}
			b1.reverse();

			for (int i = a.length() - 1; i >= 0; i--) {
				int c1 = a.charAt(i) - '0';
				int c3 = b1.charAt(i) - '0';
				System.out.println("printing c1 and c3 = " + c1 + " ," + c3);
				sum = c1 + c3;
				System.out.println("sum = " + sum);
				result.insert(0, sum);
			}
		
		
		// converting StringBuilder to String object by calling toString method
		return result.toString();
	}

}
