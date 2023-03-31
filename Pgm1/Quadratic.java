/* 1. Write a java program that prfloats all real solutions to the quadratic equation
ax2+bx+c=0. Read in a, b, c and use the quadratic formula. */

import java.util.Scanner;
class Quadratic {
        public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double r1, r2, d;
		if(a == 0) {
		        if(b == 0) {
			        System.out.println("Invalid equation.");
		        	return;
		        }
		        System.out.println("Linear Equation");
		        System.out.println("Root = " + (-b/c));
		        return;
		}
		d = b*b - 4*a*c;
		if(d < 0) {
			double real = -b / (2*a);
			double img = Math.sqrt(Math.abs(d))/(2*a);
			System.out.println("Complex Roots.");
			System.out.println("Root1 = " + real + " + i" + img + "\nRoot2 = " + real + " - i" + img);
			return;
		}
		r1 = (-b + Math.sqrt(d)) / (2*a);
		r2 = (-b - Math.sqrt(d)) / (2*a);
		if(d > 0)
			System.out.println("Real Distinct roots.");
		else // d = 0
			System.out.println("Real Equal roots");
	 	System.out.println("Root1 = " + r1 + "\nRoot2 = " + r2);     
 	}  	
}
