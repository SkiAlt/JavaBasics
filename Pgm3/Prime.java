// 3.A Write a program to check prime number
import java.util.Scanner;
class Prime {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n == 1 || n == 0) {
			System.out.println("Cannot be determined.");
			return;
		}
		for(int i = 2; i <= Math.sqrt(n); i++) { //make sure i != 0
			if(n % i == 0) {
				System.out.println("Not prime");
				return;
			}
		}
		System.out.println("Prime");
	}
}
