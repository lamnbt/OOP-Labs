import java.util.Arrays;
import java.util.Scanner;

public class Array {
	    public static void main(String args[]) {
	    	Scanner scanner = new Scanner(System.in);
	    	
	    	int n;
	    	int a[];
	    	
	    	do {
	    		System.out.print("Enter the size of the array: ");
	    		n = scanner.nextInt();
	    		if (n<0) System.out.println("Invalid array size!");
	    	} while (n<0);
	    	
	    	a = new int[n];
	    	double sum = 0;
	    	double avg = 0;	
	    	
	    	System.out.print("Enter the elements of the array: ");
	    	for (int i=0; i<n; i++) {
	    		a[i] = scanner.nextInt();
	    		sum += a[i];
	    	}
	    	avg = sum/n;
	    	
	    	Arrays.sort(a);
	    	
	    	System.out.print("The array after sorting: ");
	    	for (int i=0; i<n; i++) {
	    		System.out.print(a[i] + " ");
	    	}
	    	System.out.println();
	    	System.out.println("The sum of the array is: " + sum);
	    	System.out.println("The average of the array is: " + avg);
	    	
	    	System.exit(0);
	    }
}
