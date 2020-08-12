package interview1;

public class StringNum {
	public static void main(String[] args) {
		String str = "123";
		String str1 = "145";
		//254
		
		
		String res = add(str, str1);
		System.out.println(res);
	}
	
	public static String add(String a , String b) {
		StringBuilder result = new StringBuilder();
		//converting String to StringBuilder 
		StringBuilder b1 = new StringBuilder(b);
		b1.setLength(a.length());
		System.out.println(a.length());
		System.out.println(b1.length());
		 System.out.println("before changing length");
		System.out.println(a);
		 System.out.println(b1);
		
		
		int carry = 0;
		int sum = 0;
		
		for(int i = b1.length()-1; i >= 0; i--) {
				 char c2 = b1.charAt(i);
				 System.out.println("printing each value of b1 at " + i+" ="+c2);
				 if(c2 == ' ') {
					 c2 = '0';
				 }
			 }
			 System.out.println("after changing length and value");
			 
		 System.out.println(a);
		 System.out.println(b1); 
		 	
			// b1.insert(0, 0);
			 System.out.println("printing each value of b1 at " + 0+" ="+b1.charAt(0));
			 
		 
		 
		 for(int i = 0; i < b1.length(); i++) {
			 char c7 = b1.charAt(i);
			 System.out.println("printing each value inside b1 at " + i +" = " + c7);
		 }
		 
		 
		 for(int i = a.length()-1; i >= 0; i--) {
				 int c1 = a.charAt(i) - '0';
				 int c3 = b1.charAt(i) - '0';
				 System.out.println("printing c1 and c3 = "+ c1+" ,"+c3);
				 sum = c1 + c3;
				 System.out.println("sum = " + sum);
				 result.insert(0, sum);
			 }		
		//converting StringBuilder to String object by calling toString method
		return result.toString();
	}

}
