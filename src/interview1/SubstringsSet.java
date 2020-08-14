package interview1;

import java.util.ArrayList;

public class SubstringsSet {
	public static ArrayList<String>al=new ArrayList<String>(); 
	public static void main(String[] args) {
		String str = "abc";
		String res = "";
		String s = str.substring(1);
		System.out.println(s);
		s = str.substring(1);
		System.out.println(s);
		//1<<2 means 2's power 2 1<<6 means 2's power 6
		// System.out.println(1<<2);
		
		    
		        String s1="abcd"; 
		        findsubsequences(s1,"");    // Calling a function 
		        System.out.println(al); 
	
	}
	
	
	public static void findsubsequences(String s, String ans) { 
        if(s.length()==0) 
        { 
            al.add(ans);  
            return; 
        } 
  
                //we add adding 1st character in string            
        findsubsequences(s.substring(1),ans+s.charAt(0)) ; 
  
                // Not adding first character of the string 
                // because the concept of subsequence either  
                // character will present or not 
        findsubsequences(s.substring(1),ans);       
    } 

	public static void printchar() {
		char alpha[] = {'A', 'B', 'C'};
		for (int m = 1 ; m != 1<<alpha.length ; m++) {
		    for (int i = 0 ; i != alpha.length ; i++) {
		        if ((m & (1<<i)) != 0) {
		            System.out.print(alpha[i]);
		        }
		    }
		    System.out.println();
		}
		
	}
	
	
}
