package interview1;

public class MatrixMultiply {
	public static void main(String[] args) {
		// 2 by 2 array
		int[][] a = { { 1, 6 }, { 3, 5 } };
		int[][] b = { { 2, 7 }, { 4, 9 } };
		int[][] c = matrixMultiply(a, b);
	}

	private static int[][] matrixMultiply(int[][] a, int[][] b) {
		int res = 0;
		for(int i = 0;i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				for(int k = 0; k < a.length; k++) {
					a[i][k] = a[i][k] * b[k][i] ;
				}
			}
		}
		return null;
	}
}
