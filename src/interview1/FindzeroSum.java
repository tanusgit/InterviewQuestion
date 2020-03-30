package interview1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindzeroSum {
	// find a pair of elements in array whose sum is zero
	public static void main(String[] args) {
		int[] array = { 1, 2, 8, 0, -2, 5, 3, -3, 0 };
		Arrays.sort(array);
		for(int m : array) {
			System.out.println(m);
		}
		find(array);
	}

	private static void find(int[] array) {
		List<keep> list2 = new ArrayList<>();
		int zero = 0;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				sum = array[i] + array[j];
				if (sum == 0) {
					keep k = new keep(array[i], array[j], sum);
					list2.add(k);
				}
			}
		}

		for (keep kp : list2) {
			System.out.println(kp);
		}

	}
}

class keep {
	int element;
	int element2;
	int sum;

	@Override
	public String toString() {
		return "keep [element=" + element + ", element2=" + element2 + ", sum=" + sum + "]";
	}

	public keep(int element, int element2, int sum) {
		super();
		this.element = element;
		this.element2 = element2;
		this.sum = sum;
	}
}

