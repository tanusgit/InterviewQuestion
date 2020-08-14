package interview1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StringNum {
	public static void main(String[] args) {
		String str = "123";
		String str1 = "518";
		// 815 + 321 = 146 then reverse 641
		// 123 + 8 = 131

		String res = add(str, str1);
		System.out.println(res);
	}

	public static String add(String a, String b) {
		StringBuilder result = new StringBuilder();
		StringBuilder a1 = new StringBuilder(a);

		// converting String to StringBuilder
		StringBuilder b1 = new StringBuilder(b);

		int carry = 0;
		int sum = 0;
		int lena = a.length();
		int lenb = b.length();

		if (b.length() > a.length()) {
			int temp = lena;
			lena = lenb;
			lenb = temp;

		}
		System.out.println(lenb);
		int len = b.length();
		b1.setLength(a.length());
		// setting 0 to index where we have garbage values
		for (int i = b1.length() - 1; i >= len; i--) {
			b1.setCharAt(i, '0');
			// b1.reverse();
			System.out.println("b1 after clearing garbage and reversing" + b1);
		}

		// a1.reverse();

		for (int i = a1.length() - 1; i >= 0; i--) {
			int c1 = a1.charAt(i) - '0';
			int c3 = b1.charAt(i) - '0';
			sum = c1 + c3 + carry;
			carry = sum / 10;
			sum = sum % 10;

			System.out.println("printing c1, c3 " + c1 + " ," + c3 + " and carry =  " + carry + " at position = " + i
					+ " sum = " + sum);

			result.insert(0, sum);

		}

		// converting StringBuilder to String object by calling toString method
		return result.toString();
	}

}
