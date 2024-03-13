import java.util.Scanner;

public class AddMatrices {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int n1, m1;
		int n2, m2;
		
		boolean cont;
		
		do {
			cont = true;
			System.out.print("Enter the size of the first matrix: ");
			n1 = scanner.nextInt();
			m1 = scanner.nextInt();
			if (n1<=0 || m1<=0) cont = false;
		} while (!cont);
		
		do {
			cont = true;
			System.out.print("Enter the size of the second matrix: ");
			n2 = scanner.nextInt();
			m2 = scanner.nextInt();
			if (n1!=n2 || m1!=m2 || n2<=0 || m2<=0) {
				System.out.println("The two matrices are of different sizes!");
				cont = false;
			}
		} while (!cont);
		
		int a[][] = new int[n1][m1];
		int b[][] = new int[n2][m2];
		int res[][] = new int[n1][m1];
 		
		System.out.println("Enter the first matrix (n x m): ");
		for (int i=0; i<n1; i++) {
			for (int j=0; j<m1; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Enter the second matrix (n x m): ");
		for (int i=0; i<n1; i++) {
			for (int j=0; j<m1; j++) {
				b[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("The sum of two matrices is: ");
		for (int i=0; i<n1; i++) {
			for (int j=0; j<m1; j++) {
				res[i][j] = a[i][j] + b[i][j];
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
		
		System.exit(0);
	}
}
