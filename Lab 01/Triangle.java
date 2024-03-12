import java.util.Scanner;

public class Triangle {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		int n = scanner.nextInt();
		for (int i=0; i<n; i++) {
			for (int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for (int j=0; j<=2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.exit(0);
	}
}
