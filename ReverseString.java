package interview1;

import java.util.ArrayList;

public class ReverseString {
	/*
	 * 1) Write a Program to Reverse words in a String Example: My name is abcd-
	 * Output Should be – abcd is name My .
	 */
	public static void main(String[] args) {
		String str = "My name is abcd";
		String[] m = reverse(str);
		for (String n : m) {
			System.out.println(n);
		}

	}
//when we get the string without space we need to store that in the arraylist but if 
// we get a space we will smpty the res variable as we do not wish to get the previous 
//string collected in the res variable so we emptied the res variable and added the res
//variable to the arraylist. Now the question is when do we add the 
	private static String[] reverse(String str) {
		ArrayList<String> arr = new ArrayList<>();
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				res = res + str.charAt(i);
			// System.out.println("res " + res);
			if (str.charAt(i) == ' ') {
				arr.add(res);
				res = "";

			}

		}
		arr.add(res);
		String[] arr2 = new String[arr.size()];
		int size = arr.size();
		for (int i = 0; i < arr.size(); i++) {
			arr2[size - 1] = arr.get(i);
			size--;
		}

		return arr2;
	}
}
