package interview1;

public class AddStringNum {
public static void main(String[] args) {
	String a = "-20";
	String b = "20";
	
	add(a,b);
}

private static void add(String a, String b) {
	// add two integer
	int a1 = Integer.parseInt(a);
	int b1 = Integer.parseInt(b);
	int res = a1+b1;
	System.out.println(res);
	
	
}
}
