package hacherrank;

public class Leap {
	public static void main(String args[]) {
		int array[] = { 0, 1, 1, 1, 0, 1, 1, 1, 0 };
		int leap = 1;
		String m = win(array, leap);
		System.out.println(m);
		int num = ones(array);
		System.out.println("result = " + num);
	}

	// counting the consecutive one
	public static int ones(int array[]) {
		int count = 0;
		int newcount = 0;
		for (int i = 0; i < array.length; i++) {
			
			if (array[i]==0) {
				count = 0;
			/*if (array[i] == 1 && array[i + 1] == 1) {
				count++;

				if (array[i] == 0) {
					count = 1;
				}
*/
				// System.out.println("inside if = " + count);
			}
			else {
				count++;
			}
			//newcount is storing the max array of ones in each iteration of the loop
			newcount = Math.max(newcount, count);

		}
		return newcount;
	}

	public static String win(int array[], int leap) {
		int n = ones(array);
		String res = "";

		boolean flag = false;

		if (leap > n) {
			flag = true;
		}

		if (flag == true) {
			res = "win";
		} else {
			res = "failed";
		}

		return res;
	}
}
