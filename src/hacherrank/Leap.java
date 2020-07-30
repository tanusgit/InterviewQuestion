package hacherrank;

public class Leap {
	public static void main(String args[]) {
		int array[] = {1, 0, 1, 0, 0};
		int leap = 3;
		String m = win(array, leap);
		System.out.println(m);
		int i=0;
		while( i < 5) {
			System.out.println(i);
			i++;
		}
	}

	public static String win(int array[], int leap) {
		String res = "";
		int len = array.length;
		int k = 0;
		boolean flag = false;
		int temp = 0;
		while(k < len-1) {
			System.out.println("at the beginning  " + k);
			if(array[k+1] == 0 ) {
			System.out.println("inside first if" + (k+1) + " " + array[k+1]);
				k++;
				temp = k;
				flag = true;
			//	System.out.println("this is temp" + temp);
			}
	
			if(temp+leap < len && array[temp+leap] == 0) {
			//	System.out.println(temp + " +" + leap+ " " + (temp+leap));
				flag = true;
			}
			else {
				//System.out.println("failed");
				flag = false;
			}
			
			System.out.println("at the end  " + k);
			k++;
			
		}
		//System.out.println(flag);
		if(flag == true) {
			res = "win";
		} 
		else res = "failed";
		

		return res;
	}
}
