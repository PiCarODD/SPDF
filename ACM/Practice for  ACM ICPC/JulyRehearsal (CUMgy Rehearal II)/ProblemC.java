import java.util.Scanner;

public class ProblemC {
	public static void main(String[] args) {
		// TODO code application logic here
		int n;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();

		int[][] a = new int[n][n];

		int[][] b = new int[n][n];

		int[][] c = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = input.nextInt();
			}
		}
		//System.out.println("Enter the elements of 2nd martix row wise \n");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		//System.out.println("The product is:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		input.close();
	}
}
