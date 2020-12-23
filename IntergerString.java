package yahoo;

public class IntergerString {
	public static void main(String[] args) {
		String a = "123";
		String b = "12";
		//result = "135"
		
		String c = add(a, b);
	}

	private static String add(String a, String b) {
		String c = "";
		int carry = 0;
		int result = 0;
		int resultarr[];
		int count = 0;
		char barr[] = new char[a.length()];
		char aarr[] = new char[a.length()];
		//cheching if a's length is bigger than b's length. If yes, then we will loop
		//it for the length of a
		if(a.length()>b.length()) {
			for(int i = b.length()-1; i >= 0 ; i--) {
				barr[count] = b.charAt(i);	
				count++;
			}
		}
		for(int i = 0; i < barr.length; i++) {
			
			//System.out.println("index " + i + " " + barr[i]);
		}
		for(int i = b.length(); i < barr.length; i++) {
			barr[i] = '0';
			//System.out.println("index " + i + " " + barr[i]);
		}
		for(int i = 0; i < barr.length; i++) {
			
			System.out.println("index " + i + " " + barr[i]);
		}
		int count2 = 0;
		//now reverse a 
		for(int i = a.length()-1; i >= 0; i--) {
			aarr[count2] = a.charAt(i);
			count2++;
		}
		for(int i = 0; i < aarr.length; i++) {
			
			System.out.println("index " + i + " " + aarr[i]);
		}
		for(int i = 0; i < aarr.length; i++) {
			result = aarr[i] + barr[i];
			System.out.println(result);
			
		}
		
		return null;
	}
}

/*for(int i = 0; i < a.length(); i++) {
	
	 result = a.charAt(i) + b.charAt(i);
	 
	 System.out.println("result is = " +result );
*/
