import java.util.Scanner;
public class CountDays {
	public static void main(String args[]) {
		String[] Month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		Scanner scanner = new Scanner(System.in);
		boolean cont = false;
		int imonth = 0;
		int year = 0;
		do {
			System.out.print("Enter month: ");
			String month = scanner.next();
			for (int i=0; i<Month.length; i++) {
				if (month.compareTo(Month[i].substring(0, 3))==0 || month.compareTo(Month[i].substring(0, 3)+'.')==0 || month.compareTo(Month[i])==0) {
					cont = true;
					imonth = i+1;
					break;
				}
			}
			if (cont==false) System.out.println("Invalid month. Please reinput month!");
		} while(!cont);
		
		do {
			cont = true;
			System.out.print("Enter year: ");
			year = scanner.nextInt();
			if (year<0) {
				System.out.println("Invalid year. Please reinput year!");
				cont = false;
			}
		} while(!cont);
		
		int days = 0;
		if (imonth == 2 && ((year%4==0 && year%100!=0) || year%400==0)) days = 29; 
		else if ((imonth%2!=0 && imonth<=7) || (imonth%2==0 && imonth>=8)) days = 31;
		else if ((imonth%2==0 && imonth<=7) || (imonth%2!=0 && imonth>=8)) days = 30;
		else days = 28;
		
		System.out.println(Month[imonth-1] + " " + year + " has " + days + " days.");
	}
}