package yahoo;

public class IntergerString {
	public static void main(String[] args) {
		String a = "123";
		String b = "978";
		//result = "1101"
		StringBuilder m = new StringBuilder("135");
		m.reverse();
		//System.out.println(m);
		String c = add(a, b);
		System.out.println(c);
	}

	private static String add(String a, String b) {
		StringBuilder c = new StringBuilder("");
		int carry = 0;
		int carry2 = 0;
		int result = 0;
		int resultarr[];
		int count = 0;
		int count2 = 0;
		char barr[] = new char[a.length()];
		char aarr[] = new char[a.length()];
		//cheching if a's length is bigger than b's length. If yes, then we will loop
		//it for the length of a
		if(a.length()>b.length()) {
			for(int i = b.length()-1; i >= 0 ; i--) {
				barr[count] = b.charAt(i);	
				count++;
			}
			for(int i = b.length(); i < barr.length; i++) {
				barr[i] = '0';
				//System.out.println("index " + i + " " + barr[i]);
			}
			
			//now reverse a 
			for(int i = a.length()-1; i >= 0; i--) {
				aarr[count2] = a.charAt(i);
				count2++;
			}

			for(int i = 0; i < aarr.length; i++) {
				//char c='1'; int a=Integer.parseInt(String.valueOf(c)); 
				//getting the char from char array
				char fa = aarr[i];
				char fb = barr[i];
				//converting the char into int
				int af =Integer.parseInt(String.valueOf(fa)); 
				int bf =Integer.parseInt(String.valueOf(fb)); 
				result = af + bf;
				
				c.append(result);
				System.out.println(aarr[i] + " " + barr[i] + " = " +result);
				//c.reverse();
			}
			c.reverse();
		}
		
		else if((a.length()==b.length())) {
			for(int i = a.length()-1; i >= 0 ; i--) {
				//char c='1'; int a=Integer.parseInt(String.valueOf(c)); 
				//getting the char from char array
				char fa = a.charAt(i);
				char fb = b.charAt(i);
				//converting the char into int
				int af =Integer.parseInt(String.valueOf(fa)); 
				int bf =Integer.parseInt(String.valueOf(fb)); 				
				
				result =  carry +  af+ bf;
				System.out.println(" " + af + " " + bf + " = " +result);
				if(result > 9) {
					carry = 1;
					result = result % 10;
				}
				else 
					carry = 0;
				c.append(result);
				
				//result = 1 + af + bf;
				System.out.println("carry = " + carry);	
			}
			if(carry == 1) {
				c.append(carry);
			}
			c.reverse();
		}
		//c.reverse();
		return c.toString();
	}
}


