package interview1;

public class MatrixMultiply {
	public static void main(String[] args) {
		// 2 by 2 array
		int[][] a = { { 1, 6 }, { 3, 5 } };
		int[][] b = { { 2, 7 }, { 4, 9 } };
		matrixMultiply(a, b);
	}

	private static void matrixMultiply(int[][] a, int[][] b) {
		int c[][]=new int[a.length][b.length];  
		int res = 0;
		for(int i = 0;i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				c[i][j]=0;   
				for(int k = 0; k < a.length; k++) {
					c[i][j]+=a[i][k]*b[k][j];      
				}
				System.out.print(c[i][j]+" "); 
			}
			System.out.println();
		}
	}
}
