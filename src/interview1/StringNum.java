package interview1;

import java.lang.reflect.Array;

public class StringNum {
	public static void main(String[] args) {
		String str = "123";
		String str1 = "518";
		// 641
		int t = '0' - '0';
System.out.println(t);
		String res = add(str, str1);
		System.out.println(res);
	}

	public static String add(String a, String b) {
		StringBuilder result = new StringBuilder();
		int carry = 0;
		int sum = 0;
		int lena = a.length();
		int lenb = b.length();

		// converting String to StringBuilder
		StringBuilder b1 = new StringBuilder(b);
		
		
		
		if(b.length() > a.length()) {
			int temp = lena;
			lena = lenb;
			lenb = temp;
		
		}
			
			int len = b.length();
			b1.setLength(a.length());
			//setting 0 to index where we have garbage values
			for (int i = b1.length() - 1; i >= len; i--) {
				b1.setCharAt(i, '0'); 
				
			}
			//need to reverse b1 as at index 0 we have 5
			b1.reverse();
			StringBuilder a1 = new StringBuilder(a);
			a1.reverse();
			for (int i = a1.length() - 1; i >= 0; i--) {
				int c1 = a1.charAt(i) - '0';
				int c3 = b1.charAt(i) - '0';
				System.out.println("printing c1, c3 and carry = " + c1 + " ," + c3 + " " +carry);
				sum = c1 + c3 + carry;
				sum = sum % 10;
				System.out.println("sum = " + sum);
				carry = sum / 10;
				result.insert(0, sum);
				
			}
		
		
		// converting StringBuilder to String object by calling toString method
		return result.reverse().toString();
	}

}
