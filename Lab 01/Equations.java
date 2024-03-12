package week_1;

import javax.swing.JOptionPane;

public class Equations {
	public static void main(String args[]) {
		boolean cont = true;
		do {
			int choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your choice: " + '\n' + "1.Solve first-degree equation" + '\n' + "2.Solve system of first-degree equations" + '\n' + "3.Solve second-degree equation" + '\n' + "4.Exit", "Equation Solving", JOptionPane.INFORMATION_MESSAGE));
			switch(choice) {
			case 1:	//Solving first-order equation
				double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a: ", "Equation ax^2 + bx = 0", JOptionPane.INFORMATION_MESSAGE));
				double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b: ", "Equation ax^2 + bx = 0", JOptionPane.INFORMATION_MESSAGE));
				if (a==0 && b!= 0) JOptionPane.showMessageDialog(null, "The equation has no solution", "Result", JOptionPane.INFORMATION_MESSAGE);
				else if (a==0 && b==0) JOptionPane.showMessageDialog(null, "The equation has infinitely many solutions", "Result", JOptionPane.INFORMATION_MESSAGE);
				else {
					double res = -b/a;
					JOptionPane.showMessageDialog(null, "The equation has a unique solution: x = " + res, "Result", JOptionPane.INFORMATION_MESSAGE);
				}
				break;
				
			case 2:	//Solving system of first-order equations
				double a1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a1: ", "Equation a1x + b1y = c1 of the system", JOptionPane.INFORMATION_MESSAGE));
				double b1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b1: ", "Equation a1x + b1y = c1 of the system", JOptionPane.INFORMATION_MESSAGE));
				double c1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter c1: ", "Equation a1x + b1y = c1 of the system", JOptionPane.INFORMATION_MESSAGE));
				double a2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a2: ", "Equation a2x + b2y = c2 of the system", JOptionPane.INFORMATION_MESSAGE));
				double b2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b2: ", "Equation a2x + b2y = c2 of the system", JOptionPane.INFORMATION_MESSAGE));
				double c2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter c2: ", "Equation a2x + b2y = c2 of the system", JOptionPane.INFORMATION_MESSAGE));
				
				double D = a1*b2-a2*b1;
				double Dx = c1*b2-c2*b1;
				double Dy = a1*c2-a2*c1;
				
				if (D!=0) {
					double x = Dx/D;
					double y = Dy/D;
					JOptionPane.showMessageDialog(null, "The system has an unique set of solution: " + '\n' + "x = " + x + '\n' + "y = " + y, "Result", JOptionPane.INFORMATION_MESSAGE);
				}
				else if (D==0) {
					JOptionPane.showMessageDialog(null, "The system has infinitely many sets of solution", "Result", JOptionPane.INFORMATION_MESSAGE);
				}
				else if (Dx==0 || Dy==0) {
					JOptionPane.showMessageDialog(null, "The system has no solution", "Result", JOptionPane.INFORMATION_MESSAGE);
				}
				break;
				
			case 3:	//Solving second-degree equation
				double ax = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a: ", "Equation ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE));
				double bx = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b: ", "Equation ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE));
				double cx = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter c: ", "Equation ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE));
				
				double x1, x2, x;
				
				if (ax==0) {
					if (bx==0 && cx!=0) JOptionPane.showMessageDialog(null, "The equation has no solution", "Result", JOptionPane.INFORMATION_MESSAGE);
					else if (bx==0 && cx==0) JOptionPane.showMessageDialog(null, "The equation has infinitely many solutions", "Result", JOptionPane.INFORMATION_MESSAGE);
					else if (bx!=0 && cx==0) JOptionPane.showMessageDialog(null, "The equation has a unique solution: x = 0", "Result", JOptionPane.INFORMATION_MESSAGE);
				}
				else if (ax!=0) {
					double delta = bx*bx-4*ax*cx;
					if (delta<0) {
						JOptionPane.showMessageDialog(null, "The equation has no solution", "Result", JOptionPane.INFORMATION_MESSAGE);
					}
					else if (delta==0) {
						x = -bx/(2*ax);
						JOptionPane.showMessageDialog(null, "The equation has a unique root:" + '\n' + "x = " + x);	
					}
					else if (delta>0) {
						x1 = (-bx+Math.sqrt(delta))/(2*ax);
						x2 = (-bx-Math.sqrt(delta))/(2*ax);
						JOptionPane.showMessageDialog(null, "The equation has two roots:" + '\n' + "x1 = " + x1 + '\n' + "x2 = " + x2, "Result", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				break;
			
			case 4:
				cont = false;
				JOptionPane.showMessageDialog(null, "Closed", "Termination", JOptionPane.CLOSED_OPTION);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid choice. Please choose again!", "Error", JOptionPane.WARNING_MESSAGE);
				break;
			}
		} while(cont);
		System.exit(0);
	}
}
