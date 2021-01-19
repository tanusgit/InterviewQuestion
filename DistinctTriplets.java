package interview1;

public class DistinctTriplets {
	//you are given a string s, which consists
public static void main(String[] args) {
	String str = "abcdaaae";
	//abc bcd cda daa aaa aae 
	int n = distict(str);
	System.out.println(n);
	//answer 4
	//abcd
	//len = 4
	//4-2 = 2
}

private static int distict(String str) {
	// TODO Auto-generated method stub
	int count = 0;
	int sum = 0;
	for(int i = 0; i < str.length(); i++) {
		if(i == str.length()-1) {
			break;
		}
		for(int j = i+1; j < i+2; j++) {
			if(sum == 3) {
				break;
			}
			if(str.charAt(i) != str.charAt(j) && str.charAt(j) != str.charAt(j+1)
					&& str.charAt(i) != str.charAt(j+1)) {
				count++;
			}
			sum++;
		}
	}
	return count;
}
}
