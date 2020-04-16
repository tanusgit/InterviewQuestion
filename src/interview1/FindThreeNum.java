package interview1;

import java.util.ArrayList;
//find three num whose sum is closest to the target num
public class FindThreeNum {
	public static void main(String[] args) {
		int array[] = { 1, 2, 5, 4, 6, 8, 9 };
		int target = 15;
		find2(array, target);
	}
//approach1
	private static void find(int[] array, int target) {
		int sum = 0;
		int minDiff = 0;
		ArrayList<Keep> array2 = new ArrayList<>();
		ArrayList<Integer> array3 = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				for (int k = j + 1; k < array.length; k++) {
					sum = array[i] + array[j] + array[k];
					minDiff = Math.abs(sum - target);
					Keep e = new Keep(array[i], array[j], array[k], sum, minDiff);
					
					array2.add(e);
					array3.add(minDiff);
				}
			}
		}

		int min = array3.get(0);
		for (int l = 0; l < array3.size(); l++) {
			if (array3.get(l) < min) {
				min = array3.get(l);
			}
		}
	
		for (int n = 0; n < array2.size(); n++) {
			if (min == array2.get(n).min) {
				System.out.println(array2.get(n).a + " " + array2.get(n).b + " " + array2.get(n).c);
			}
		}
	}


//approach2
private static void find2(int[] array, int target) {
	int sum = 0;
	int minDiff = 0;
	int min= 0;
	ArrayList<Keep> array2 = new ArrayList<>();
	ArrayList<Integer> array3 = new ArrayList<>();
	for (int i = 0; i < array.length; i++) {
		for (int j = i + 1; j < array.length; j++) {
			for (int k = j + 1; k < array.length; k++) {
				sum = array[i] + array[j] + array[k];
				minDiff = Math.abs(sum - target);
				min = minDiff;
				
					System.out.println(min);
					Keep e = new Keep(array[i], array[j], array[k], sum, min);
					array2.add(e);
					array3.add(min);
			}
			if(minDiff < min) {
				min = minDiff;
			}
				
			
		}
	}
	//System.out.println(array3);
}

}
class Keep {
	int a;
	int b;
	int c;
	int sum;
	int min;

	public Keep(int a, int b, int c, int sum, int min) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.sum = sum;
		this.min = min;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Keep [a=" + a + ", b=" + b + ", c=" + c + ", sum=" + sum + " min=" + min + "]";
	}

}
