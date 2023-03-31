//3.B Write a program for Arithmetic calculator using switch case menu
import java.util.Scanner;
class SwitchCalcy {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Operands:");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		System.out.println("Operator:");
		String operator = sc.next();
		switch(operator) {
			case "+": System.out.println(a+b); break;
			case "-": System.out.println(a-b); break;
			case "*": System.out.println(a*b); break;
			case "/": System.out.println(a/b); break;
			default : System.out.println("Invalid operator");
		}
	}
}
