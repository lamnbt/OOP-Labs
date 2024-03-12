package week_1;

import javax.swing.JOptionPane;

public class Doubles {
	public static void main(String args[]) {
		String strnum1, strnum2;
		
		//Enter two doubles as strings
		strnum1 = JOptionPane.showInputDialog(null, "Please enter the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		strnum2 = JOptionPane.showInputDialog(null, "Please enter the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
		
		//Convert strings to doubles
		double num1 = Double.parseDouble(strnum1);
		double num2 = Double.parseDouble(strnum2);
		
		//Calculations
		double sum = num1 + num2;
		double diff = num1 - num2;
		double product = num1 * num2;
		double quotient = num1 / num2;
		
		//Results
		JOptionPane.showInternalMessageDialog(null, "The sum of the two numbers is "+ sum, "Sum of two numbers", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showInternalMessageDialog(null, "The difference of the two numbers is "+ diff, "Difference of two numbers", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showInternalMessageDialog(null, "The product of the two numbers is "+ product, "Product of two numbers", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showInternalMessageDialog(null, "The quotient of the two numbers is "+ quotient, "Quotient of two numbers", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}
