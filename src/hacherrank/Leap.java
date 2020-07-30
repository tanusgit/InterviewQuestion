package hacherrank;

public class Leap {
	public static void main(String args[]) {
		int array[] = {0,1,0};
		int leap = 1;
		String m = win(array, leap);
		System.out.println(m);
		int num = ones(array);
		//System.out.println("result = " + num);
	}
	
	
	public static int ones(int array[]) {
		int count = 1;
		for(int i = 0; i < array.length-1; i++) {
			if(array[i] == 1 && array[i+1] == 1) {
				count++;
				//System.out.println("inside if = " + count);
			}
		}
		return count;
	}

	public static String win(int array[], int leap) {
		int n = ones(array);
		String res = "";
		
		boolean flag = false;
		
		if(leap > n) {
			flag = true;
		}
		
		if(flag == true) {
			res = "win";
		} 
		else {
			res = "failed";
		}
		

		return res;
	}
}
