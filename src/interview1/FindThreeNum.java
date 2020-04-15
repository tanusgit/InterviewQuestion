package interview1;

import java.util.ArrayList;

public class FindThreeNum {
	public static void main(String[] args) {
		int array[] = { 1, 2, 5, 4, 5, 6, 8, 9 };
		int target = 5;
		find(array, target);
	}

	private static void find(int[] array, int target) {
		int sum = 0;
		ArrayList<Keep> array2 = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				for (int k = j + 1; k < array.length; k++) {
					sum = array[i] + array[j] + array[k];
					Keep e = new Keep(array[i], array[j], array[k], sum);
					if (Math.abs(sum-target) == 1) {
						array2.add(e);
					}
				}
			}
		}
		System.out.println(array2);
	}

}

class Keep {
	int a;
	int b;
	int c;
	int sum;

	public Keep(int a, int b, int c, int sum) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.sum = sum;
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
		return "Keep [a=" + a + ", b=" + b + ", c=" + c + ", sum=" + sum + "]";
	}

}
